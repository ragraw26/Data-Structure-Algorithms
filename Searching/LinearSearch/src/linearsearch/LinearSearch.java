/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

/**
 *
 * @author Rajat
 */
public class LinearSearch {

    public static void main(String[] args) {

        int[] arr1 = {23, 45, 21, 55, 234, 1, 34, 90};
        int searchKey = 34;
        System.out.println("Key " + searchKey + " found at index: " + linerSearch(arr1, searchKey));
        int[] arr2 = {123, 445, 421, 595, 2134, 41, 304, 190};
        searchKey = 421;
        System.out.println("Key " + searchKey + " found at index: " + linerSearch(arr2, searchKey));
    }

    private static int linerSearch(int[] arr, int searchKey) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == searchKey) {
                return i;

            }

        }
        return -1;

    }

}
