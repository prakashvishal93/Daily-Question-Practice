package Lecture_17;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 20 , 30 , 40 , 50};
        reversed(arr);
        System.out.println(Arrays.toString(arr));
        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));

    }
    static void reversed(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }

    static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
