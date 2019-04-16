import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n;
		if(x>y){
			n = y ;
		}
		else{
			n = x;
		}
		
		int gcd=0;
		for(int i=1; i<=n; i++){
			if(x%i==0 && y%i==0){
				gcd = i;
			}
		}
		System.out.println(gcd);
		
		sc.close();
	}

}
