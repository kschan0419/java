import java.util.Scanner;

public class TriangleWave2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt(); //number of cases
		if (N>=1 &&N<=100){
		for(int a=0; a<N; a++){
			int amp = sc.nextInt(); //input the value of amplitude
			int freq = sc.nextInt(); //input the value of frequency
			if (freq>=1 &&freq<=10){
			for(int i = 1; i <= freq; i++){
				if (amp>=1 &&amp<=9){
				for(int j=1; j<=amp; j++){ //increasing
					for(int k=1; k<=j; k++){
						System.out.print(j);
					}
					System.out.println();
			    }
				
				for (int l =(amp-1); l>=1; l--){ //decreasing
					for( int m=1; m<=l; m++){
						System.out.print(l);
					}
					System.out.println();
					}
				}
			}
			}
			System.out.println();
	    }
		}
		sc.close();
		
	}
}
