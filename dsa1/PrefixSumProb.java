package dsa1;

import java.util.Scanner;

public class PrefixSumProb {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void makePrefArr(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            arr[i] += arr[i-1];
        }
    }

    static void makeSuffixArr(int[] arr){
        int n = arr.length;

        for(int i = n-2; i >= 0; i--){
            arr[i] += arr[i+1];
        }
    }

    static int findArrTotalSum(int[] arr){
        int n = arr.length;
        int totalSum = 0;

        for(int i = 0; i < n; i++){
            totalSum += arr[i];
        }

        return totalSum;
    }

    static boolean isPartition(int[] arr) {
        int n = arr.length;
        int totalSum = findArrTotalSum(arr);

        int prefSum = 0;
        for (int i = 0; i < n - 1; i++) {
            prefSum += arr[i];

        int sufSum = totalSum - prefSum;

        if (prefSum == sufSum) {
            return true;
        }
    }
        return false;
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

//        makePrefArr(arr);
//        makeSuffixArr(arr);
//        printArray(arr);

        System.out.println(isPartition(arr));

    }
}
