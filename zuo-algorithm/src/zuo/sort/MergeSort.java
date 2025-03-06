package zuo.sort;

public class MergeSort {
    private static int [] help;
    public static void main(String[] args) {
        int [] arr = new int[]{5,4,6,3,2,9,1,8,7};
        help = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
    private static void printArr(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print("]");
    }

    private static void mergeSort(int arr[], int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid,  right);
    }

    private static void merge(int arr[], int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            help[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= mid) {
            help[k++] = arr[i++];
        }
        while (j <= right) {
            help[k++] = arr[j++];
        }
        for (int m = left; m <= right; m++) {
            arr[m] = help[m];
        }
    }
}
