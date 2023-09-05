package com.aman;

public class Q06_Anagram {
    public static boolean isAnagram(String a , String b){
        char[] charArray_a = a.toCharArray();
        char[] charArray_b = b.toCharArray();

        boolean flag = true;
        for(int i=0;i<=charArray_a.length-1;i++){
            for(int j=0; j<charArray_b.length-j-1; j++){
                flag = false;
                if(charArray_a[i] == charArray_b[j]){
                    char temp = charArray_b[j];
                    charArray_b[j] = charArray_b[charArray_b.length-i-1];
                    charArray_b[charArray_b.length-i-1] = temp;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                return flag;
            }

        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("allergy","allergic"));
        System.out.println(isAnagram("geeksforgeeks","forgeeksgeeks"));


    }
}
