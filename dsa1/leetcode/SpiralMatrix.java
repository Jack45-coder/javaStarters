package dsa1.leetcode;

import java.util.Scanner;

public class SpiralMatrix {
    static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void printSpiral(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int lc = 0, rc =  c-1;
        int tr = 0, br = r-1;

        int totalEle = 0;

        while (totalEle < r*c){
            // 1. Left to Right
            for(int j = lc; j <= rc && totalEle < r*c; j++){
                System.out.print(matrix[tr][j] + " ");
                totalEle++;
            }
            tr++;

            // 2. Top to Bottom
            for(int i = tr; i <= br && totalEle < r*c; i++){
                System.out.print(matrix[i][rc] + " ");
                totalEle++;
            }
            rc--;

            // 3. Right to Left
            for(int j = rc; j >= lc && totalEle < r*c; j--){
                System.out.print(matrix[br][j] + " ");
                totalEle++;
            }
            br--;

            // 4. Bottom to Top
            for(int i = br; i >= tr && totalEle < r*c; i--){
                System.out.println(matrix[i][lc]);
                totalEle++;
            }
            lc++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers of row of matrix_1: ");
        int r = sc.nextInt();
        System.out.print("Enter numbers of col of matrix_1: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter " + r*c + " elements of matrix_1");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral Matrix:");
        printSpiral(arr);

        System.out.println("\n\nOriginal Matrix:");
        printMatrix(arr);
    }
}
