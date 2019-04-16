import java.util.Scanner;

public class MersennePrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		for(int i=0; i<n; i++){
			a *= 2;
			
			int count = 0;
			for(int j=1 ; j<=a; j++){
				if((a-1)%j==0){
					count++;
				}
			}
			if (count==2){
				System.out.println((i+1)+" "+(a-1));
			}
		}
		
		sc.close();
	}

}
