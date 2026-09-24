import java.lang.*;
import java.util.Scanner;
public class Distance
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.println("enter the speed of the vehicle (kmph) : " );
int speed = in.nextInt();
System.out.println("enter the time taken by the vehicle:");
int time= in.nextInt();
int distance = speed*time;
System.out.println("the distance travelled by the vehicle is " +(distance));
}
}