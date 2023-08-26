package com.aman;

public class Q03_BitonicPointTrial2 {
    public static int findMaximum(int[]arr , int n){
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            if(arr[n-2] < arr[n-1]){
                return arr[n-1];
            }

            int mid = (start + end) / 2;

            if ((arr[mid] < arr[mid + 1 ] && arr[mid] > arr[mid - 1])) {
                start = mid+1;

            }
            else if(arr[mid] > arr[mid + 1 ] && arr[mid] < arr[mid - 1]){
                end = mid-1;
                // start = 0;
            }
            else{
                return arr[mid];
            }

        }
        return arr[n - 1];
    }

    public static void main(String[] args) {
        int [] arr = {5, 1079, 950, 901, 899, 801, 750, 650, 10, 1};
        System.out.println(findMaximum(arr,arr.length));
    }
}
