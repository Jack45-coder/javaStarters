package dsa1.leetcode;

import java.util.Scanner;

public class ProductSum {

   public static int[] maxProductSum(int[] arr, int target) {
      int n = arr.length;
      int mxProduct = Integer.MIN_VALUE;
      int bestI = -1;
      int bestJ = -1;

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            if (i != j && arr[i] + arr[j] == target && arr[i] > arr[j]) {
               int product = arr[i] * arr[j];

               if (product > mxProduct) {
                  mxProduct = product;
                  bestI = i;
                  bestJ = j;
               }
            }
         }
      }

      return new int[] { bestI, bestJ };
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

      System.out.print("Enter target: ");
      int target = sc.nextInt();

      int[] bestPair = maxProductSum(arr, target);

      if (bestPair[0] == -1) {
         System.out.println("No valid pair found");
      } else {
         int product = arr[bestPair[0]] * arr[bestPair[1]];

         System.out.println("Best pair: "
               + bestPair[0] + ", " + bestPair[1]);

         System.out.println("Maximum product: " + product);
      }
      sc.close();
   }

}
