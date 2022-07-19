package com.tns.looping;

import java.util.Scanner;

//for loop
public class example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<n;i++)
		{
			System.out.println(i+" ");
			s.close();
		}
	}

}
