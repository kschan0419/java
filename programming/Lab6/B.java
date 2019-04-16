import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if ( n>=1 && n<=100 ){
			for (int i=0; i<n; i++){
				
				int altSum = 0;
				int num = sc.nextInt();
				if ( num>=1 && num<=1000 ){
					for (int j=1; j<=num; j++){
						if (j%2==0){
							altSum -= j;
						}
						else {
							altSum += j;
						}
					}
					System.out.println("Case #"+(i+1)+": "+altSum);
				}				
				
			}
		}
		sc.close();
	}

}
