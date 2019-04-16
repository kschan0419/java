import java.util.Scanner;

public class question6A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		if (T>=1 && T<=100){
			for(int i=0;i<T;i++){
				
				int X = sc.nextInt();
				if (X<=100){
					
					int[]arr = new int[X];
					for(int j=0;j<X;j++){
						arr[j] = sc.nextInt();
					}
					int max = 0;
					for(int k =0;k<X;k++){
					if(arr[k]>max){
						max = arr[k];
					}
					}
					
					int a=0;
					for(int k1 =0;k1<X;k1++){
					if(arr[k1]==max){
						a++;
					}
					}
					
					int min = arr[0];
					for(int l =0;l<X;l++){
					if(arr[l]<min){
						min = arr[l];
					}
					}
					
					int b=0;
					for(int l1 =0;l1<X;l1++){
					if(arr[l1]==min){
						b++;
					}
					}
					
				System.out.println(min+" "+b+" "+max+" "+a);
				}
				
				
				
			}
		}
		
		sc.close();
	}

}