package dsa1;

import java.util.Scanner;

public class RangeQuery {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] makePrefix(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        return pref;
    }

    static void makePrefixII(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
    }

    static void makeSuffix(int[] arr) {
        int n = arr.length;

        for (int i = (n - 1 - 1); i >= 0; i--) {
            arr[i] += arr[i + 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter size of array: ");
        int n = sc.nextInt();
        if (n <= 0)
            return;
        int[] arr = new int[n+1];
        System.out.println("Enter elements here");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        // makePrefixII(arr);
        // printArr(arr);

        // makeSuffix(arr);
        // printArr(arr);

        int[] prefSum = makePrefix(arr);
        System.out.println("Enter number of query: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l - 1];
            System.out.println("sum " + ans);
        }

        sc.close();
    }
}