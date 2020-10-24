package org.oddeven;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
	    num= sc.nextInt();
		if (num%2==0) {
			System.out.println("Even number");
		} else {
			System.out.println("odd number");

		}
		
		System.out.println("changes");
	}

}
