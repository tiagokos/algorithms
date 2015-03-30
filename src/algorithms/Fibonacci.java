package algorithms;

/**
 * Print the Fibonacci series up to N
 * 
 * @author Tiago Kosciuk
 *
 */
public class Fibonacci {
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		for (int i = 1; i <= 10; i++) {
			System.out.print(f.fibonacciRecusion(i) + " ");
		}
		System.out.println("");
		for (int i = 1; i <= 10; i++) {
			System.out.print(f.fibonacciLoop(i) + " ");
		}
	}

	
	// Java program for Fibonacci number using recursion.
    public int fibonacciRecusion(int number){
        if(number == 1 || number == 2){
            return 1;
        }
 
        return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2);
    }
    
	// Using loop
	private int fibonacciLoop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		
		int fibo = 1;
		int fibo2 = 1;
		int fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo + fibo2;
			fibo = fibo2;
			fibo2 = fibonacci;
		}
		return fibonacci;
	}

}
