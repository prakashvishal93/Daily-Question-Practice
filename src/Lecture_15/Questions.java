package Lecture_15;

import java.util.*;

public class Questions {
    public static void main(String[] args) {
        int[] arr = {70,60,20,1,50,30,55,34,100,33};

        int[] arr1 = {10,20,10,10, 50};
       int[] ans = smallestAndLargest(arr);
        System.out.println(Arrays.toString(ans));

        System.out.println(sum(arr));
        System.out.println(max(arr));
        System.out.println(search(arr,70));
        System.out.println(noOfOccurences(arr,90));
        System.out.println( "Last Occurence is " + lastOccurence(arr,70));
        System.out.println(strictCount(arr,70));
        System.out.println(sortedOrNot(arr1));


    }

    static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int max(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if( max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static int search(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    static int noOfOccurences(int[] arr, int target){
        int count = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
    static int lastOccurence(int[]arr, int x){
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                lastIndex = i;
            }

        }
        return lastIndex;
    }

    static int strictCount(int[] arr,int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }
    static boolean sortedOrNot(int[] arr){
        boolean check = false;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]){
                check = true;
                break;
            }
        }
        return check;
    }

    static int[] smallestAndLargest(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length -1 ]};
        return ans;
    }

}
