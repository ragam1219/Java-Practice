package javaday4assignments;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        boolean isprime=true;
   	 for(int i=2;i<n;i++)
   		{
   		 if(n%i==0)
   			{
                isprime=false;
   			 break;
   		 }
   		 
   	 }
   	 if(isprime==true)
   		{
   		 System.out.println(n+""+"is a prime number");
   	 }
   	 else
   		 System.out.println(n+"is Not A Prime Number");
   	}
	}


