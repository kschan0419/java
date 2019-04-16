import java.util.Scanner;

public class question6E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int T = sc.nextInt();
		if (T>=1 && T<=100){
			for(int i=0;i<T;i++){
				int IP =0;
				int N = sc.nextInt();
				if (N>=1 && N<=20){
					
					int[]a =new int[N];
					for (int j =0;j<N;j++){
						a[j] = sc.nextInt();
					}
					
					int[]b =new int[N];
					for (int k =0;k<N;k++){
						b[k] = sc.nextInt();
					}
					
					for(int l=0;l<N;l++){
						IP += a[l]*b[l];
					}
	
				}
			System.out.println("Case #"+(i+1)+": "+IP);
			}
		}
		
		sc.close();
	}

}
