import java.util.Scanner;

class Perfect
{
    public static void main(String []args)
    {
        int no, i = 1, sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter any number");
        no = sc.nextInt();

        while(i < no)
        {
            if(no % i == 0)
                sum = sum + i;

            i++;
        }

        if(sum == no)
            System.out.println("The entered number " + no + " is Perfect");
        else
            System.out.println("The entered number " + no + " is not Perfect");
    }
}