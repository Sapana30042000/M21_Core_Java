package com.cg.exception;

import java.util.Scanner;

//program on finally block
public class FinallyBlock {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        //if any exception will be there in a try block
        //that exception will handle by catch block
        try 
        {
        	//int res=15/x;
        	System.out.println("hi");
        }
        catch(Exception e)
        {
        	System.out.println("Exception Handled");
        }
        finally
        {
        	System.out.println("Whether any exception occur or not, the finally block is always executed");
        }
        System.out.println("M-21 Batch-Angular");
	}

}
