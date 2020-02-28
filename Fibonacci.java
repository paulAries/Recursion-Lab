package fibonacci;
/*
 * This class represents an example of how to use recursion in java  **/

public class Fibonacci {
	static int fib(int n) //
    { 
    if (n <= 1) // base case
       return n; 
    return fib(n-1) + fib(n-2);//calling the method until the base case occur 
    } 
}
