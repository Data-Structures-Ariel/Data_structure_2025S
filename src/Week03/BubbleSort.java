package Week03;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {


    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //O(n^2)
    private static void bubbleSort(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                if (arr1[j] > arr1[j + 1])
                    swap(arr1, j, j + 1);
                System.out.println("Index - " + j + " " + Arrays.toString(arr1));
            }
        }
    }
//O(1/2n^2 + 1/2n)
    private static void bubbleSort2(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1])
                    swap(arr1, j, j + 1);
                System.out.println("Index - " + j + " " + Arrays.toString(arr1));
            }
        }
    }
}
