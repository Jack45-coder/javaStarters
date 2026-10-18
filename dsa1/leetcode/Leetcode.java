package dsa1.leetcode;

import java.util.Scanner;

public class Leetcode {
    static long reverse(int x) {
        char[] arr = String.valueOf(x).toCharArray();
        int st = 0;
        int end = arr.length - 1;
        while (st < end) {
            char temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }

        return Long.parseLong(new String(arr));
    }

    static boolean isPalindrome(int x) {

        if (x < 0)
            return false;

        long revArr = reverse(x);
        if (x == revArr) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits: ");
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));

        sc.close();
    }
}
