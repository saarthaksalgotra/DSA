package ete;

import java.util.*;

public class palindrome {
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int n= str.length();
        sc.close();
        int count=0;
        HashSet<String> unique= new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                String sub= str.substring(i, j);
                if(new StringBuilder(sub).reverse().toString().equals(sub) && !unique.contains(sub)){
                    unique.add(sub);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}