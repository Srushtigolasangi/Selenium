package javapgms;

import java.util.Scanner;

public class SwapNowithout3rdNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no for a");
		int a=sc.nextInt();
		System.out.println("Enter the no for b");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping value of a is "+a);
		System.out.println("After swapping value of b is "+b);
	}

}
