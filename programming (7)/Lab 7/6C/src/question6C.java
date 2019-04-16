import java.util.Scanner;

public class question6C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		if (T>=1 && T<=100){
			for (int i=0; i<T; i++){
				
				int X = sc.nextInt();
				int [] arr = new int [X];
				for (int j=0; j<X; j++){
					arr[j] = sc.nextInt();
				}
				
				int min = arr[0];
				int max = arr[0];
				for (int k=0; k<X; k++){
					if(arr[k]<=min){
						min = arr[k];
					}
					if(arr[k]>=max){
						max = arr[k];
					}
				}
				
				int n1=0;
				int n2=0;
				for (int l=0; l<X; l++){
					if(arr[l]==min){
						n1++;
					}
					if(arr[l]==max){
						n2++;
					}
				}	
					
				System.out.println("Case #"+(i+1)+": "+min+" "+n1+" "+max+" "+n2);
				
			}
		}
		sc.close();
	}

}
