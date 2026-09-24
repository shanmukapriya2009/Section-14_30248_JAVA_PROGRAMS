import java.lang.*;
import java.util.Scanner;
public class Salary
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.println("enter the basic salary:");
int basic_salary = in.nextInt();
double hra =0.2 * basic_salary;
double da = 0.1 * basic_salary ;
double net_salary = basic_salary+ hra+ da;
System.out.println("basic salary is :" +(basic_salary));
System.out.println("hra is:" +(hra));
System.out.println("da is:"+(da));
System.out.println("Net salary is :" +(net_salary));
}
}