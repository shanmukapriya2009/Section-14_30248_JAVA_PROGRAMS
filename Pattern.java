import java.util.Scanner;

class Pattern
{
    public static void main(String []args)
    {
        int i = 5, j;

        while(i >= 1)
        {
            j = 5;

            while(j >= 6-i)
            {
                System.out.print(j + " ");
                j--;
            }

            System.out.println();
            i--;
        }
    }
}