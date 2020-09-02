package com.google.interview;


import static util.ArrayUtil.*;

/**
 * Move zeros to the left
 *
 * Move all zeros to the left of an array while maintaining its order.
 */
public class MoveZerosToLeft {

    public static void main(String[] args) {
        int[] a = generateArray(1000);
//        int[] a = {13, 5, -4, 0 ,2};
        System.out.println("Start array");
        printArray(a);

        int[] result = moveZeros(a); // O(n)

        System.out.println("Result array");
        printArray(result);

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
