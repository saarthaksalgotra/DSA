package ete;

import java.util.Scanner;

public class palindromeObsession {
        public static int solve(String str,int i,int j){
        if(i>=j){
            return 0;
        }
        if(str.charAt(i)==str.charAt(j)){
            return solve(str,i+1,j-1);
        }

        return Math.min(solve(str,i+1,j),solve(str,i,j-1))+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        int count=solve(str,0,str.length()-1);
        System.out.println(count);
    }
}
