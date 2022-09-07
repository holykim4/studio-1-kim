package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("year?");
		int year = in.nextInt();
		boolean divisibleByFour = year%4==0;
		boolean notEvenlyDivisibleBy100 = !(year%100==0);
		boolean evenlyDivisibleBy400 = year%400==0;
		boolean leapYear = (divisibleByFour&&notEvenlyDivisibleBy100)||evenlyDivisibleBy400;
	    System.out.print(leapYear);
	}
	

}
