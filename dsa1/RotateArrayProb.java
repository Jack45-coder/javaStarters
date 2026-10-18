package dsa1;

import java.util.Scanner;

public class RotateArrayProb {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse(int[] arr, int st, int end){
        int n = arr.length;
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }
    }

    static void rotateKStepsToRight(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    static void rotateKStepsToLeft(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n-k);
        reverse(arr, n-k+1, n-1);
        reverse(arr, 0, n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of arr: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements here");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter times of rotation: ");
        int k = sc.nextInt();

//        reverse(arr, 0, arr.length-1);
//        rotateKStepsToRight(arr, k);
        rotateKStepsToLeft(arr, k);
        printArray(arr);
    }
}
