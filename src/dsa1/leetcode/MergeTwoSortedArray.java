package src.dsa1.leetcode;

import java.util.Scanner;

public class MergeTwoSortedArray {
    static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static int[] merge(int[] a, int[] b){
        int i = 0, j = 0, k = 0;
        int n = a.length;
        int m = b.length;

        int[] ans = new int[n + m];

        while(i < n && j < m){
            if(a[i] <= b[j]){
                ans[k++] = a[i++];
            }else {
                ans[k++] = b[j++];
            }
        }

        while (i < n){
            ans[k++] = a[i++];
        }
        while (j < m){
            ans[k++] = b[j++];
        }

        return ans;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array-1 length: ");
        int n = sc.nextInt();

        if(n < 1) return;
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter array-2 length: ");
        int m = sc.nextInt();

        if(m < 1) return;
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }

        int[] ans = merge(arr1, arr2);
        printArr(ans);
    }
}
