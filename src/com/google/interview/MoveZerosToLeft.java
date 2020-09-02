package com.google.interview;


import static util.ArrayUtil.*;

/**
 * Move zeros to the left
 *
 * Given an integer array, move all elements that are 0 to the left while maintaining
 * the order of other elements in the array. The array has to be modified in-place.
 */
public class MoveZerosToLeft {

    public static void main(String[] args) {
        int[] a = generateArray(1000);
//        int[] a = {13, 5, -4, 0 ,2};
        System.out.println("Start array (Move Zeros)");
        printArray(a);

        int[] result = moveZeros(a); // O(n)

        System.out.println("Result array");
        printArray(result);

        System.out.println("Start array (In place modification)");
        printArray(a);

        result = bubbleSortZeros(a); // O(n)

        System.out.println("Result array");
        printArray(result);
    }

    private static int[] bubbleSortZeros(int[] a) {
        for (int i = a.length-1; i >= 0; i--) {
            if(a[i]==0){
                // swap up to start
                for (int j = i; j >0; j--) {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        return a;
    }

    private static int[] moveZeros(int[] a) {
        int count = 0;
        // count 0s
        for (int i = 0; i < a.length; i++) {
            if(a[i]==0){
                count++;
            }
        }
        // add zeros to result
        int[] result = new int[a.length];
        for (int i = 0; i < count; i++) {
            result[i] = 0;
        }
        // add remaining numbers
        int resultIndex = count;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==0){
                continue;
            }
            result[resultIndex] = a[i];
            resultIndex++;
        }
        return result;
    }

}
