import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a;
		int b;
		int c;
		
		if(n>=10 && n<100){
			a = n/10;
			b = n%10;
			if(n==(b*10+a)){
				System.out.println("palindrome");
			}
			else{
				System.out.println("not a palindrome");
			}
		}
		
		if(n>=100 && n<1000){
			a = n/100;
			//b = n/10%10; 2nd ways
			b = n%100/10;
			c = n%10;
			if(n==(c*100+b*10+a)){
				System.out.println("palindrome");
			}
			else{
				System.out.println("not a palindrome");
			}
		}
	
	sc.close();
	}

}
