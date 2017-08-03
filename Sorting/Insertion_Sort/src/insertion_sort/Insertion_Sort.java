package insertion_sort;

/**
 *
 * @author Rajat
 */
public class Insertion_Sort {

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Insertion_Sort s = new Insertion_Sort();
        int arr[] = {64, 25, 12, 22, 11};
        s.sort(arr);
        System.out.println("Sorted array");
        s.printArray(arr);
    }

    void sort(int[] arr) {
        
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >=0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}
