package com.aman;

public class Q08_TransposeOfMatrix {
    public static void transpose(int n , int a[][]){

        for(int i=0; i<a.length;i++){
            for(int j=i; j<a[i].length; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] a = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        System.out.println(a.length);
        transpose(a.length , a);

        for(int i=0; i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + ",");
            }
            System.out.println();
        }
    }


}
