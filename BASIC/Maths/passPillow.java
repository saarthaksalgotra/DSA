package BASIC.Maths;

public class passPillow {
    public static void main(String[] args) {
        int n = 4;
        int time = 5;
        int ans = sol(n,time);
        System.out.println(ans);
    }

    public static int sol(int n,int time)
    {

        int person = 1;
        int j=1;
        boolean flag = true;
        for(int i=0;i<time; i++)
        {
            if(person==n)
            {
                flag=false;
            }
            else
            {
                flag=true;
            }


            if(flag==true)
            {
                person=person+1;

            }
            else
            {
                person=person - j;
                j=j+1;
            }

        }
        return person;
    }
}