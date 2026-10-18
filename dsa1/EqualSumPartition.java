package dsa1;
import java.util.Scanner;

public class EqualSumPartition{
    static int findArraySum(int[] arr){
      int totalSum = 0;
      for(int i = 0; i < arr.length; i++){
        totalSum += arr[i];
      }

      return totalSum;
    }

    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);
        int prefSum = 0;

        for(int i = 0; i < arr.length; i++){
            prefSum += arr[i];
            
            int suffSum = totalSum - prefSum;
            if(prefSum == suffSum){
                return true;
            }
        }
        return false;
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

        System.out.println("Equal Partition possible: " + equalSumPartition(arr));

        sc.close();
    }
}