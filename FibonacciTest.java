package fibonacci;

import java.util.Scanner;
/*
 * This program test the Fibonacci series. the user has to enter a number,
 *  and the program is going to show the term of that position in the Fibonacci. **/
public class FibonacciTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fibo=new Fibonacci();
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		 System.out.println("Enter a number");
		 int n=input.nextInt(); 
	        System.out.println("The "+n+" th term of the Fibonacci serie is "+fibo.fib(n-1));
	}
}
