package com.cg.Array;

import java.util.Scanner;

public class TwoDUserInputArray {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Outside Array Size: ");
		int m=s.nextInt();
		System.out.println("Enter the Inside Array Size: ");
		int n=s.nextInt();
		
		int arr[][]=new int [m][n];
		
		//To Enter the Element in the array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print("Enter "+i+" "+j+" value:" );
				arr[i][j]=s.nextInt();
			}
		}
		//To enter the element in the  2d array
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr.length;j++)
					{
						System.out.print(arr[i][j]+" ");
					}
				}
				

	}

}
