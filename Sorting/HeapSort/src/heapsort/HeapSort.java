package heapsort;

/**
 *
 * @author Rajat
 */
public class HeapSort {

    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};
        HeapSort hs = new HeapSort();
        hs.sort(arr);
        System.out.println("Sorted Array :");
        printArray(arr);
    }

    private void sort(int[] arr) {
        int n = arr.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            maxheapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            maxheapify(arr, i, 0);

        }
    }

    private void maxheapify(int[] arr, int n, int i) {
        int max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[max]) {
            max = left;
        }
        if (right < n && arr[right] > arr[max]) {
            max = right;
        }
        if (max != i) {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;
            maxheapify(arr, n, max);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
