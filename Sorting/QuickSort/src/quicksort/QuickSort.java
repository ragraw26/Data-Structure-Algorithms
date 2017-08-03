package quicksort;

/**
 *
 * @author Rajat
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a[] = {10, 1, 8, 4, 6, 2, 25, 3};
        QuickSort qs = new QuickSort();

        System.out.println("Given Array");
        printArray(a);

        qs.sort(a, 0, a.length - 1);

        System.out.println("\nSorted array");
        printArray(a);

    }

    private static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    private int partition(int[] a, int low, int high) {

        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }

    private void sort(int[] a, int low, int high) {
        if (low < high) {

            int pi = partition(a, low, high);
            sort(a, low, pi - 1);
            sort(a, pi + 1, high);

        }
    }

}
