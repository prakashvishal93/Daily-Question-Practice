package Lecture_17;

public class SecondLargestUsingLargestFunction {
    public static void main(String[] args) {

        int[] arr = {50, 30, 20 , 30, 1};
        int ans= secondLargest(arr);
        System.out.println(ans);

    }
    static int  secondLargest(int[] arr){
        int secondLargestt = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != largest(arr)){
                secondLargestt = arr[i];
            }
        }
        return secondLargestt;
    }
    static int largest(int[] arr){
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }

        }
        return largest;

    }
}
