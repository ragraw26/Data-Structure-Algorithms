package bubblesort;

/**
 *
 * @author Rajat
 */
public class BubbleSort {

    public static void main(String[] args) {
        // TODO code application logic here

        BubbleSort bs = new BubbleSort();
        int arr[] = {2, 5, 8, 1, 10, 50, 20};
        bs.bubbleSort(arr);
        System.out.println("Sorted Array");

    }

    void bubbleSort(int a[]) {
        boolean swapped = false;
        int size = a.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1, a);
                    swapped = true;

                }
            }

            if (swapped == false) {
                break;
            }
            printArray(a);

        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private void swap(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
