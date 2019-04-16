import java.util.Scanner;

public class question6B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = 1;
		N = sc.nextInt();
		
		if (N>0 && N<=100){

			int x = 1;
			
			while (N != 0){
				
				if (N!=0){
					
					String [] arr = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
					int []mm = new int[N];
					for (int i = 0 ; i < N ; i++){
						int dd = sc.nextInt();
						mm [i] = sc.nextInt();
						int yyyy = sc.nextInt();
						}
					System.out.println("Case #"+x+":");
					
					for (int a=0; a<12; a++){
					System.out.print(arr[a]+":");
					for (int j = 0 ; j < N ; j++){
					if (mm[j]==(a+1)){
					System.out.print("*");
					}
					}
					System.out.println();
					
					}
					
					N = sc.nextInt();
				x++;
				
				}
			}
		}

		sc.close();
	}

}

