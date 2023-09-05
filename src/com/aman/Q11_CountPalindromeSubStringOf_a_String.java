package com.aman;

public class Q11_CountPalindromeSubStringOf_a_String {
    public static int CountPS(String S, int N){
        int counter =0;
        for(int i=0; i<S.length()-1; i++){
            for(int j=S.length();j>i+1;j--){
                String subOf_S = S.substring(i,j);
                StringBuilder copyOf_subOf_S = new StringBuilder(subOf_S);
                String reversed = copyOf_subOf_S.reverse().toString();
                if(subOf_S.equals(reversed)){
                    counter++ ;
                }
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(CountPS("abbaeae",5));
    }
}
