import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			int sum = 0;
			for(int j=1; j<i; j++){
				if(i%j==0){
					sum += j;
				}
			}
			if(sum==i){
				System.out.println(i+" is perfect number");
			}
		}
		
		sc.close();
	}

}
