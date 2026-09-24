import java.util.Scanner;
public class Celsius
{
public static void main(String[] args)
{

Scanner in= new Scanner(System.in);
System.out.println("enter your temperature in celcius");
float fahrenheit = in.nextFloat();
float celcius = (fahrenheit-32)*5/9 ;
System.out.println("fahreheit temp is:"+(celcius));
}
}