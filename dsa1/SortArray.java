package dsa1;
import java.util.Scanner;

public class SortArray {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sortZeroesAndOnes(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        for (int i = 0; i < zeros; i++) {
            arr[i] = 0;
        }

        for (int i = zeros; i < n; i++) {
            arr[i] = 1;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort0Aur1(int[] arr) {
        int st = 0;
        int end = arr.length - 1;

        while(st < end){
            if(arr[st] == 0){
                st++;
            }
            else if(arr[end] == 1){
                end--;
            }
            else{
                swap(arr, st, end);
                st++;
                end--;
            }
        }
    }

    static void rev(int[] arr) {
        int st = 0, end = arr.length-1;

        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }
    }
    static int[] square(int[] arr) {
        int n = arr.length;
        int st = 0, end = n-1;
        int[] sq = new int[n];
        int k = 0;

        while(st <= end){
            if(Math.abs(arr[st]) > Math.abs(arr[end])){
                sq[k++] = arr[st]*arr[st];
                st++;
            }else{
                sq[k++] = arr[end]*arr[end];
                end--;
            }
        }

        rev(sq);
        return sq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements here");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // sortZeroesAndOnes(arr);
        // sort0Aur1(arr);
        int[] sq = square(arr);
        printArr(sq);

        sc.close();
    }
}