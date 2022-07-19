package com.tns.decisionmaking;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		//switch
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("Shrivalli");
				break;
			case 2:
				System.out.println("hello");
				break;
			case 3:
				System.out.println("rita");
				break;
			default:
				System.out.println("invalid input");
				s.close();
		}

	}

}
