package Lecture_18;

import java.util.Arrays;

public class squareOfElement {
    public static void main(String[] args) {
        int[] arr = {-10, -5, -2, 1 , 4, 9 };

        square(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        
        
    }
    static void square(int[] arr) {
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]  * arr[i];
        }
    }
}
