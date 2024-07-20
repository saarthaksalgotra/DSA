package ADS;

import java.util.Scanner;

public class lexicographical {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
		for(int i = 0; i < 10;i++){
			sol(i,n);
		}
	}
	
	public static void sol(int cur, int n){
		if(cur > n){
			return;
		}

        System.out.println(cur);
        for(int i = 0;i < 10;i++){
            if(cur==0)
            {
                i++;
            }
            sol(10 * cur + i, n);
        }
    }
}