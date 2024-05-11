package task;
import java.util.Scanner;
public class Assignment2 {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose 1:Addition  2:Subtraction  3:Multiplication  4:Division ");
		int choose=sc.nextInt();
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double result;
		switch(choose)
		{
		case 1:
			System.out.println("Addition of Two numbers are a&b ");
		    result=a+b;
		    System.out.println(result);
		    break;
		case 2:
			System.out.println("Subtraction of Two numbers are a&b ");
		    result=a-b;
		    System.out.println(result);
		    break;
		case 3:
			System.out.println("Multiplication of Two numbers are a&b ");
		    result=a*b;
		    System.out.println(result);
		    break;
		case 4:
			System.out.println("Division of Two numbers are a&b ");
		    result=a/b;
		    System.out.println(result);
		    break;
               default:
            	   System.out.println("Invalid Data");

			}
		}
 }
