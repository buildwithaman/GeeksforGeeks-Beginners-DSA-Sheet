package com.aman;

public class Q12_Kth_bit_is_Set_or_Not {
    public static int decimalToBinary(int n){
        String binary_num = "";
        if(n == 0){
            return 0;
        }
        while(n >= 1){
            int remainder = n % 2;
            n = n/2;
            binary_num = remainder +binary_num;
        }

        return Integer.parseInt(binary_num);
    }

    public static boolean checkKthBit(int n , int k){
        int remainder = 0;
        if(n == 0){
            return false;
        }

        for(int i=0;i<=k;i++){
            remainder = n % 2;
            n = n/2;
        }

        if(remainder == 1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkKthBit(500,3));

    }
}


// My approach for solving the problem
