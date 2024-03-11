package Lecture_17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        swap(20,40);
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans  = reverseAnArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    //Given two integers a and b . Swap the given value using temp variable
    static void swap( int a , int b ){
        System.out.println("Original Value : " + a  + " " +  b );
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped Value : " + a + " " + b);
    }

    // Swap and element without using temporary variable
    static void swapWithoutTemp(int a, int b){
        System.out.println("Original Value : " + a  + " " +  b );
        a = a + b;
        b = a - b;
        a  = a - b;
        System.out.println("Swapped Value : " + a + " " + b);
    }

    //reverse an array consisting integer value

    static int[] reverseAnArray(int[] arr){
        int[] ans = new int[arr.length] ;
        int j = 0;

        for(int i = arr.length -1; i >= 0 ; i--){
            arr[j++] = arr[i];
        }

        return ans;
    }




}
