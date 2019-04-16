import java.util.Scanner;

public class FibbonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int previous = 1;
		int current = 0;
		int fib;
		for(int i=0; i<n; i++){
			fib = previous + current;
			previous = current;
			current = fib;
			System.out.print(fib+" ");
		}
		
		sc.close();
	}

}
