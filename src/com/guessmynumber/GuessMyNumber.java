package com.guessmynumber;

import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int myNumber = (int) (Math.random() * 100);
		int number = 0;
		
		do{
			System.out.println("Guess your number in between (0-100) : ");
			number = input.nextInt();
			if(number == myNumber) {
				System.out.println("WooHoo.. Correct No");
				break;
			}
			else if(number > myNumber) {
				System.out.println("Your Number is too large");
			}
			else {
				System.out.println("Your Number is too small");
			}
		}
		while(number >= 0);
		System.out.println("My number is : " + myNumber);
	} 
}
