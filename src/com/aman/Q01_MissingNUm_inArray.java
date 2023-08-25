package com.aman;

public class Q01_MissingNUm_inArray {
    // GEeks for geeks DSA beginner sheet
    /*
    Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
    Example 1:
    Input:
    N = 5
    A[] = {1,2,3,5}
    Output: 4

     */
    public static int missingNum(int[]arr , int n){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return (n*(n+1))/2 - sum;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,5};
        System.out.println(missingNum(arr , 5));
    }
}

/*
Logic of the solution
1. first find the sum of elements from 1 , 2 ,3.....n
2. find sum of all the elements in the array
3  return (step1 - step2)
 */