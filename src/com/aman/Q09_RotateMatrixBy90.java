package com.aman;

public class Q09_RotateMatrixBy90 {
    //approach of solving this problem
    // first reverse the matrix
    // then take its transpose

    // total time taken to solve the problem :---  tried for 1.5hr on day1 but not solved and 28min on day 2 finally solved
    // taken hint from striver youtube channel

    //method for reversing the matrix
    public static void reverseTheMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[i].length - 1;
            while (start <= end) {
                //swap
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    //method for rotating the matrix by 90degrees
    public static void rotateBy90(int matrix[][] , int n){
        reverseTheMatrix(matrix);

        // taking the transpose of the matrix
        for(int i=0; i< matrix.length; i++){
            for(int j=i; j<matrix[i].length; j++){
                //swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        }

    public static void main(String[] args) {
        int  [][]a = {{1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9}};
        int n = a.length;
        rotateBy90(a ,n);

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" , ");
            }
            System.out.println();
        }
    }
}
