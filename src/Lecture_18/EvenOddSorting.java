package Lecture_18;

import java.util.Arrays;

public class EvenOddSorting {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void sort (int[] arr){
        int left = 0 ;
        int right = arr.length -1;
        while(left < right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr, left, right);
                left++;
                right--;
            }

            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 == 1){
                right--;
            }
        }
    }
    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left]  = arr[right];
        arr[right] = temp;
    }
}
