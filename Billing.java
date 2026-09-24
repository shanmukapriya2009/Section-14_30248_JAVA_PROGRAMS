import java.lang.*;
public class Billing
{
public static void main (String args [])
{
//items print
int laptopprice=45000; //store 45000 in variable a
int mouse=500; //store 500 in variable b
int keyboard=1500; //store 1500 in variable c
int gstrate=18; //18%
int total=laptopprice+mouse+keyboard;
System.out.println("total cost="+total);
double gst=(float)18/100*total;
System.out.println("gst=" +gst);
}
}