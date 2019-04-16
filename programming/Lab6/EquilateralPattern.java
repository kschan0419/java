import java.util.Scanner;

public class EquilateralPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		if (n>=1 && n<=100){
			for (int h=0; h<n; h++){
				int size = sc.nextInt();
				if(size>=1 && size<=40){
					for(int i=1; i<=size; i++){
						for(int j=1; j<=(size-i); j++){
							System.out.print(" ");
						}
						for(int k=1; k<=i; k++){
							System.out.print("*");
						}
						for(int l=2; l<i+1; l++){
							System.out.print("*");
						}
						System.out.println();
					}
				}
			}
		}
		
		sc.close();
	}

}
