package src.dsa1;

import java.util.Scanner;

public class RectangleSum {
    static void printArray(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // row-wise prefix sum
    static void prefixSumMat(int[][] mat){
        int r = mat.length;
        if (r == 0) return;
        int c = mat[0].length;

        for(int i = 0; i < r; i++){
            for (int j = 1; j < c; j++){
                mat[i][j] += mat[i][j-1];
            }
        }
    }

    // col-wise prefix sum
    static void prefixSumMat2(int[][] mat){
        int r = mat.length;
        if (r == 0) return;
        int c = mat[0].length;

        for(int j = 0; j < c; j++){
            for (int i = 1; i < r; i++){
                mat[i][j] += mat[i-1][j];
            }
        }
    }

    // row & col both side prefix sum
    static void prefixSumMat3(int[][] mat){
        int r = mat.length;
        if (r == 0) return;
        int c = mat[0].length;

        for(int i = 0; i < r; i++){
            for (int j = 1; j < c; j++){
                mat[i][j] += mat[i][j-1];
            }
        }

        for(int j = 0; j < c; j++){
            for (int i = 1; i < r; i++){
                mat[i][j] += mat[i-1][j];
            }
        }
    }


    static int findSum(int[][] mat, int l1, int r1, int l2, int r2){
        int sum = 0;

        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum += mat[i][j];
            }
        }

        return sum;
    }

    static int findSum2(int[][] mat, int l1, int r1, int l2, int r2){
        int sum = 0;
        prefixSumMat(mat);

        for(int i = l1; i <= l2; i++){
            if(r1 >= 1){
                sum += mat[i][r2] - mat[i][r1-1];
            }else {
                sum += mat[i][r2];
            }
        }
        return sum;
    }

    static int findSum3(int[][] mat, int l1, int r1, int l2, int r2){
        int ans = 0;
        prefixSumMat3(mat);

        int sum = 0, up = 0, left = 0, upperLeft = 0;

        sum = mat[l2][r2];
        if(l1 >= 1) {
            up = mat[l1 - 1][r2];
        }
        if(r1 >= 1){
            left = mat[l2][r1-1];
        }
        if(l1 >= 1 && r1 >= 1) {
            upperLeft = mat[l1 - 1][r1 - 1];
        }

        ans = sum - up - left + upperLeft;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows & cols: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        System.out.println("Enter " + r*c + " elements");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter L1 & R1: ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();

        System.out.print("Enter L2 & R2: ");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int sum = findSum(mat, l1, r1, l2, r2);
        System.out.println("SUM: " + sum);

        int sum3 = findSum3(mat, l1, r1, l2, r2);
        System.out.println("SUM3: " + sum3);

//        prefixSumMat3(mat);
//        printArray(mat);

        sc.close();
    }
}
