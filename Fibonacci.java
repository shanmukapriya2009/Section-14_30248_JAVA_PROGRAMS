 public class Fibonacci
{
public static void main (String args[])
{
int a = 0;
int b = 1;
int sum = 0;
System.out.println("First 8 Fibonacci terms");
for (int i=1; i<=8; i++)
{
System.out.println(a + " ");
sum = sum + a;
int c=a + b;
a = b;
b = c;
}
System.out.println("\nSum = " +sum);
}
}

