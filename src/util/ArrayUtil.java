package util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayUtil {
    public static int[] generateArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.floor(Math.random()*100));
        }
        return array;
    }

    public static void printArray(int[] array){
        String collect = Arrays.stream(array).mapToObj(i -> String.valueOf(i)).collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
