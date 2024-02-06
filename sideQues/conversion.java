package sideQues;

public class conversion {
    public static void main(String[] args) {
        int binNum = 101;
        int decNum = 5;
        binTodec(binNum);
        decTobin(decNum);
    }

    public static void binTodec(int binNum)
    {
        int decNum=0;
        int pow = 0;
        
        while(binNum>0)
        {
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            binNum = binNum/10;
            pow++;
        }

        System.out.println(decNum);
    }

    public static void decTobin(int decNum)
    {
        int binNum = 0;
        int pow = 0;
        
        while(decNum > 0)
        {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            decNum = decNum/2;
            pow++;
        }

        System.out.println(binNum);
    }
}