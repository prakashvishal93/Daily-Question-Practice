package Lecture_18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1};
        printArray(arr);
        sortZeroandOneInPlace(arr);
        System.out.println("Sorted Array : ");
        printArray(arr);

    }

    static void sort0and1(int[] arr) {
        int count = 0;
        for (int nums : arr) {
            if (nums == 0)
                count++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(i < count){
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }

    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    static void sortZeroandOneInPlace(int[] arr){
        int left = 0, right = arr.length - 1 ;

        while(left < right){
           if(arr[left] == 1 && arr[right] == 0) {
               swapAnArray(arr, left,right);
               left++;
               right--;
           }
           if(arr[left] == 0){
                left++;
           }
           if(arr[right] == 1){
               right--;
           }

        }

    }
    static void swapAnArray(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
