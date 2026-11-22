package src.dsa1;

import java.util.Scanner;

public class UniqueElements {

    static int getUnique(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int unique = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                unique = arr[i];
            }
        }

        return unique;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements here: ");
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int unique = getUnique(arr);
        System.out.println("Unique element is : " + unique);
    }
}
