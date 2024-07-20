package reappear.COREJAVA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runrate {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        int overs = sc.nextInt();

        try{
            float runrate = runs/overs;
            System.out.print(runrate);
        }
        catch (Exception e)
        {
            System.out.print(e.getClass().getName());
        }
    }
}
