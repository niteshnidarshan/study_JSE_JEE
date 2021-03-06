package core.basic;

import java.util.Scanner;

public class DecimalToRoman {
/**
 * This program converts Decimal number to Roman
 * 
 * 50 = L
 * 100 = C
 * 500 = D
 * 1000 = M
 * 
 * 40 = XL
 * 90 = XC
 * 
 * 400 = CD
 * 900 = CM
 * 
 * 1 = I [w]
 * 4 = IV [if]
 * 5 = V [if]
 * 9 = IX [if]
 * 10 = X [w]
 * 
 * 40 = XL [if]
 * 50 = L [if]
 * 90 = XC [if]
 * 100 = C [w]
 * 
 * 400 = CD [if]
 * 500 = D [if]
 * 900 = CM [if]
 * 1000 = M [w]
 * 
 */
	
	int n;
	public void set(int n)
	{
		this.n = n;
	}
	public void convert()
	{
		if(n<=0)
			System.out.println("No Roman Equivalent");
		else
		{
			while(n >= 1000)
			{
				System.out.print("M");
				n = n-1000;
			}
			if(n >= 900)
			{
				System.out.print("CM");
				n = n-900;
			}
			if(n >= 500)
			{
				System.out.print("D");
				n = n-500;
			}
			if(n >= 400)
			{
				System.out.print("CD");
				n = n-400;
			}
			while(n >= 100)
			{
				System.out.print("C");
				n = n-100;
			}
			if(n >= 90)
			{
				System.out.print("XC");
				n = n-90;
			}
			if(n >= 50)
			{
				System.out.print("L");
				n = n-50;
			}
			if(n >= 40)
			{
				System.out.print("XL");
				n = n-40;
			}
			while(n >= 10)
			{
				System.out.print("X");
				n = n-10;
			}
			if(n >= 9)
			{
				System.out.print("IX");
				n = n-9;
			}
			if(n >= 5)
			{
				System.out.print("V");
				n = n-5;
			}
			if(n >= 4)
			{
				System.out.print("IV");
				n = n-4;
			}
			while(n >= 1)
			{
				System.out.print("I");
				n = n-1;
			}
			
		}
		
	}
	
	public static void main(String s[])
	{
		System.out.println("Provide a single value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DecimalToRoman dtr = new DecimalToRoman();
		dtr.set(n);
		dtr.convert();
		
	}

}
