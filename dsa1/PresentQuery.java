package dsa1;
import java.util.Scanner;

public class PresentQuery{

    public static int[] makeFrequencyArr(int[] arr){
        int[] freq = new int[100005];

        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }

        return freq;
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

        int[] freq = makeFrequencyArr(arr);

        System.out.println("Enter number of query: ");
        int q = sc.nextInt();

        while(q-->0){
            System.out.println("Enter number to be searched ");
            int x = sc.nextInt();
            if(freq[x] > 0){
              System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

        sc.close();
    }
}