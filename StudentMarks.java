public class StudentMarks
{
public static void main(String args[])
{
double Subject1 = 83.5;
double Subject2 = 78.8;
double Subject3 = 88.9;

double TotalMarks = Subject1 + Subject2 + Subject3;
double AverageMarks = TotalMarks / 3;
boolean Result = AverageMarks >= 0;

System.out.println("TotalMarks :" +TotalMarks);
System.out.println("AverageMarks :" +AverageMarks);
System.out.println("Result :" +(Result? "Pass" : "Fail"));
}
}