import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		if (n>=1 && n<=100){
			for (int i=0; i<n; i++){
				int heaviest = 0;
				for (int j=0; j<10; j++){
					int weight = sc.nextInt();
					if (weight <= 100){
						if (weight > heaviest){
							heaviest = weight;
						}
					}
					else {}
				}
				System.out.println("Case #"+(i+1)+": "+heaviest);
			}		
		}
		
		sc.close();
	}

}
