//输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。 
//
// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。 
//
// 
//
// 示例 1: 
// 
// 
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
// 
//
// 示例 2: 
//
// 
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
// 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-
//preorder-and-inorder-traversal/ 
//
// Related Topics 树 数组 哈希表 分治 二叉树 👍 1080 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int rootVal = preorder[0];
        int i  = 0;
        for ( ;i < inorder.length; i++) {
            if (inorder[i] == rootVal) {
                break;
            }
        }
        int [] leftPre = Arrays.copyOfRange(preorder, 1, i+1);
        int [] rightPre = Arrays.copyOfRange(preorder, i+1, preorder.length);
        int [] leftIn = Arrays.copyOfRange(inorder, 0, i);
        int [] rightIn = Arrays.copyOfRange(inorder, i+1, inorder.length);
        TreeNode root = new TreeNode(preorder[0]);
        root.left = buildTree(leftPre, leftIn);
        root.right = buildTree(rightPre, rightIn);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
