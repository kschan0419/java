import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int cases = sc.nextInt();
		for (int i=0; i<cases; i++){
			
			int [] num = new int[5];
			for (int a=0; a<5; a++){
				num[a] = sc.nextInt();
			}
			
			System.out.print("Case #"+(i+1)+":");
			
			int check = 0;
			for (int j=0; j<5; j++){
				int count = 0;
				for (int k=1; k<=num[j]; k++){
					if (num[j]%k==0){
						count++;
					}
				}
				if (count==2){
					System.out.print(num[j]+" ");
					check++;
				}
				
			}
			if (check==0){
				System.out.print("none");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
