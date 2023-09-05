package com.aman;

public class Q10_SumMatrix {
    //take the sum of the element at matrix[0][0](i.e the first element of the matrix) and matrix[n-1][n-1](last element of the matrix)
    //divide the result by 2
    // substract q
    // substract n with the absolute value of all the above operation
    // get the desired result

    public static long sumMatrix(long n , long q){
//        long difference = Math.abs((2+n*2)/2 - q);
        if(q>=2 && q<=2*n){
            return n - Math.abs((2+n*2)/2 - q);
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(sumMatrix(5,7));
    }
}
