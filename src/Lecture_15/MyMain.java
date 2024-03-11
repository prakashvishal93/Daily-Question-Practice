package Lecture_15;

public class MyMain {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 60;

        System.out.println("Original Array: ");
        print(arr);
        System.out.println();


        int[] arr_2 = arr;

        System.out.println("Copied Array : ");
        print(arr_2);

        arr_2[0] = 70;
        arr_2[1] = 33;
        System.out.println("Modified Array : ");
        print(arr_2);

    }
    static void print(int[] arr ){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }





}
