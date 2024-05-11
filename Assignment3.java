package javaday4assignments;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment3 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int arr[]= {2,5,9,14,12,7};
System.out.println(Arrays.toString(arr));
int target =sc.nextInt();

for (int i = 0; i < arr.length; i++) {
     arr[i]=i+1;
    for (int j = i + 1; j < arr.length; j++) {
    	 arr[j]=j+1;
    	 if ((arr[i]+arr[j]) == target)
    	    {
    		  System.out.println(target);
    	    }
    	  else
    	  {
    		  System.out.println("target not found");
    	  }
   }
    
    System.out.println(arr[i]);
	
    }
    
           
}

}


