package Lecture_17_01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

//        we need to swap these two
//        swap(a,b);
//        swapWithoutTemp(a,b);

        int[] arr = {1, 2, 3, 4, 5, 6,10 };
//        inPlaceReverseArray(arr);
//     reverseArrayEasyWay(arr,0, arr.length -1 );
//        System.out.println(Arrays.toString(arr));
        int ans = presentOrNot(arr, 6);
        System.out.println(ans);

    }

    static void printArray(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int a , int b){
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped Value: " + "\na : " + a +  "\nb: " +b);
    }

    static void swapWithoutTemp(int a , int b){
        a = a + b;
        b = a - b;
        a = a -b;

        System.out.println("Swapped Value : " + "\na: " + a +  "\nb: " +b);
    }
    static void swapArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        for(int index = n -1 ; index >= 0 ; index--){
            ans[j++] = arr[index];
        }
        return  ans;
    }

    static void inPlaceReverseArray(int[] arr){
        int i = 0, j = arr.length-1 ;

        while(i < j){
            swapArray(arr,i, j);
            i++;
            j--;
        }
    }

    static void reverseArrayEasyWay(int[] arr, int start, int end){
        while (start < end){

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;

        }
    }
    static int presentOrNot(int[]arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
