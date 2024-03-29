package Lecture_19;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2 , 1, 3, 4, 5};
//      int[] ans = runningSum(arr);
//        System.out.println(Arrays.toString(ans));
        runningSum(arr);
        System.out.println(Arrays.toString(arr));

    }
    /*
    static int[] runningSum(int[] arr){
        int[] pre = new int [arr.length];
        pre[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pre[i]  = pre[i - 1 ] + arr[i];
        }

        return pre;
    }
     */


    static void runningSum(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            arr[i] += arr[i - 1];
        }
    }
}
