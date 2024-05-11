package javaday4assignments;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i+1;
			
		}
		System.out.println("Original Array is:");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("Reverse Array is:");
		for(int i=arr.length-1;i>0;i--)
		{
			System.out.println(arr[i]+ " ");
		}
		
		
	}
	}
		