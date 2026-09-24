import java.util.Scanner;
           public class Armstrong
           {
              public static void main(String args[])
              {
                 int no,temp,x,rev=0;
                 Scanner sc=new Scanner(System.in);
                 System.out.println("please enter the given number");
                 no=sc.nextInt();
                 temp=no;
                 while(no>0)
                 {
                     x=no%10;
                     rev=rev+(x*x*x);
                     no=no/10;
                 }
                 if(rev==temp)
                 System.out.println("the entered number "+temp+" is Armstrong");
                 else
                 System.out.println("the entered number "+temp+" is not Armstrong");
             }
         }