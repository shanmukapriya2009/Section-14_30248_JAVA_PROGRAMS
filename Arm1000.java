import java.util.Scanner;
class Arm
{
    public static void main(String []args)
    {
        int no,temp,x,rev,n;

        for(no=1; no<=1000; no++)
        {
            temp=no;
            n=no;
            rev=0;

            while(n>0)
            {
                x=n%10;
                rev=rev+(x*x*x);
                n=n/10;
            }

            if(rev==temp)
                System.out.println(temp+" is Armstrong");
        }
    }
}