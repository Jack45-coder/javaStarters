package dsa1;

import java.util.Scanner;


public class Practice {

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    ans++;
            }
        }

        return ans;
    }

    public static int trippleSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target)
                        ans++;
                }
            }
        }

        return ans;
    }

    public static int findUnique(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }

        return ans;
    }

    public static int findMax(int[] arr) {
        int n = arr.length;
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }

        return mx;
    }

    public static int findSecondMax(int[] arr) {
        int mx = findMax(arr);
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findMax(arr);

        return secondMax;
    }

    public static int firstRepeatingNumber(int[] arr) {
        int n = arr.length;
        int repeating = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    repeating = arr[i];
                }
            }
        }
        return repeating;
    }

    public static void swap(int a, int b) {

        System.out.println("Before Swap");
        System.out.println(a + " " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap");
        System.out.println(a + " " + b);

    }

    public static void swapII(int a, int b) {

        System.out.println("Before Swap");
        System.out.println(a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap");
        System.out.println(a + " " + b);
    }

    public static void reverseInPlace(int[] arr){
        int st = 0;
       int end = arr.length - 1;
       while(st < end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
        st++;
        end--;
       }
    }

    public static void rev(int[] arr, int st, int end){
       while(st < end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
        st++;
        end--;
       }
    }  

    public static void rotateRightKSteps(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        
        rev(arr, 0, n-k-1); // 1st part
        rev(arr, n-k, n-1);   // 2nd part
        rev(arr, 0, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter size of array: ");
        int n = sc.nextInt();
        if (n <= 0)
        return;
        int[] arr = new int[n];
        System.out.println("Enter elements here");
        for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }

        System.out.println("Enter k: ");
        int k = sc.nextInt();

        // System.out.print("Enter targer sum: ");
        // int t = sc.nextInt();

        // System.out.println(pairSum(arr, t));
        // System.out.println(trippleSum(arr, t));
        // System.out.println(findUnique(arr));
        // System.out.println(findSecondMax(arr));

        // System.out.println(firstRepeatingNumber(arr));

        // swapII(10, 45);

        // reverseInPlace(arr);
        // printArr(arr);

        rotateRightKSteps(arr, k);
        printArr(arr);



        sc.close();
    }

}
