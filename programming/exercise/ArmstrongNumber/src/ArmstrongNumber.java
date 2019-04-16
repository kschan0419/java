import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int a;
		int b;
		int c;
		int d;
		
		for(int i=1; i<=n; i++){
			
			if(i>=1 && i<10){
				if(i==i*i*i){
					System.out.println(i);
				}
			}
			
			if(i>=10 && i<100){
				a = i/10;
				b = i%10;
				if(i==(a*a*a)+(b*b*b)){
					System.out.println(i);
				}
			}
			
			if(i>=100 && i<1000){
				a = i/100;
				b = i/10%10;
				c = i%10;
				if(i==(a*a*a)+(b*b*b)+(c*c*c)){
					System.out.println(i);
				}
			}
			
			if(i==1000){
				a = i/1000;
				b = i/100%10;
				c = i/10%10;
				d = i%10;
				if(i==(a*a*a)+(b*b*b)+(c*c*c)+(d*d*d)){
					System.out.println(i);
				}
			}
			
		}
		
		sc.close();
	}

}

