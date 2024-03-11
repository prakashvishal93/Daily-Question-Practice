package Lecture_16;

// Target Sum : Find the total number of pairs in the array whose sum is equal to the given value x

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4, 5,5, 6, 8};
//        System.out.println(targetSum(arr, 7));

        System.out.println(firstRepeatingNumber(arr));


    }
    static int targetSum(int[] arr, int target){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {              // First Number
            for (int j = i + 1; j < arr.length; j++) {      // Second Number

                if(arr[i] + arr[j] == target){
                    sum++;
                }
            }
        }
        return sum;
    }

    static int tripletSum(int[] arr, int target ){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1 ; k < arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k] == target){
                        sum++;
                    }
                }

            }

        }
        return sum;
    }
    static int uniqueDigits(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }

        }
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
        if(arr[i] > 0){
            ans = arr[i];
        }
        }

        return ans;
    }
    static int max(int[] arr ){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;
    }
//    static int secondMax (int[] arr ){
//        int secondLargest = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > secondLargest && arr[i] < max(arr)){
//                secondLargest = arr[i];
//            }
//        }
//
//
//        return secondLargest ;
//    }

    //Another Method
    static int secondLargest (int [] arr){
        int largestElement = max(arr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == largestElement){
                arr[i] = Integer.MIN_VALUE;
            }

        }
        int secondmax  = max(arr);

        return secondmax;
    }

    static int firstRepeatingNumber(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[i] == arr[j]){
                   return j;
                }
            }
        }
        return -1;
    }
}
