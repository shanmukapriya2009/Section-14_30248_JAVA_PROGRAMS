import java.util.Scanner;

class Palindrome
{
    public static void main(String []args)
    {
        int no, temp, x, rev = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter any number");
        no = sc.nextInt();

        temp = no;

        while(no > 0)
        {
            x = no % 10;
            rev = rev * 10 + x;
            no = no / 10;
        }

        if(rev == temp)
            System.out.println("The entered number " + temp + " is Palindrome");
        else
            System.out.println("The entered number " + temp + " is not Palindrome");
    }
}