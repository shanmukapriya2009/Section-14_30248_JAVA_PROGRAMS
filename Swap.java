import java.lang.*;
import java.util.Scanner;
public class Swap
{
public static void main(String[] args)
{
Scanner in= new Scanner(System.in);
System.out.println("enter the first number:");
int num1= in.nextInt();
System.out.println("enter the second number:");
int num2 = in.nextInt();
int num3=num1;
num1= num2;
num2=num3;

System.out.println("the number 1 you have entered is =" +num1);
System.out.println("the number 2 you have entered is =" +num2);
}
}