import java.util.Scanner;

class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name:");
        String name = sc.nextLine();

        System.out.print("Enter Roll No:");
        int rollNo = sc.nextInt();

        System.out.print("Enter marks in Subject 1: ");
        float mark1 = sc.nextFloat();

        System.out.print("Enter marks in Subject 2: ");
        float mark2 = sc.nextFloat();

        System.out.print("Enter marks in Subject 3: ");
        float mark3 = sc.nextFloat();
       
        System.out.print("Enter marks in Subject 4: ");
        float mark4 = sc.nextFloat();
       
        System.out.print("Enter marks in Subject 5: ");
        float mark5 = sc.nextFloat();

        float total = mark1 + mark2 + mark3 + mark4 + mark5;
        float Average = total / 5;


        int mark = sc.nextInt();
        if (mark1,mark2,mark3,mark4,mark5 >=90)System.out.println("O");
        else if (mark1,mark2,mark3,mark4,mark5  >= 80) System.out.println("A");
        else if (mark1,mark2,mark3,mark4,mark5 >= 70) System.out.println("B");
        else if (mark1,mark2,mark3,mark4,mark5 >= 60) System.out.println("c");
        else if (mark1,mark2,mark3,mark4,mark5 >= 50) System.out.println("D");
        else System.out.println("F");
 
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Subject 1  : " + mark1);
        System.out.println("Subject 2  : " + mark2);
        System.out.println("Subject 3  : " + mark3);
        System.out.println("Subject 4  : " + mark4);
        System.out.println("Subject 5  : " + mark5);
        System.out.println("Average    : " + Average);
        System.out.println("Grade      : " + Grade);
         

        sc.close();
    }
}