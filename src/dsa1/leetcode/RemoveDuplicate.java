package src.dsa1.leetcode;

import java.util.Scanner;

public class RemoveDuplicate {
    static int removeDuplicate(int[] arr) {
        int n = arr.length;
        int ans = 1;
        int off = 0;
        int cm = 1;

        while(cm < n){
            if(arr[cm] == arr[cm-1]){
                cm++;
                continue;
            }
            arr[off+1] = arr[cm];
            off++;
            cm++;
            ans++;
        }

        return ans;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        if(n < 1) return;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(removeDuplicate(arr));;
    }
}
