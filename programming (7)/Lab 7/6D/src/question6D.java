import java.util.Scanner; 

public class question6D {
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		if (T>=1 && T<=100){
			for (int i=0; i<T; i++){
				 
				int [] arr = new int [100];
				int x = sc.nextInt();
				int j =0;
				int n =0;
				double sum = 0;
				if (x>=0 && x<=100){
					while (x != -1){
						arr[j]= x;
						sum += arr[j];
						x = sc.nextInt();
						n++;
						j++;
					}
				}
				
				double a = sum/n;
				int A = (int)Math.round(a);
				
				double num=0;
				for (int k=0; k<n; k++){
					if (arr[k]> a){
						num ++;
					}
				}
				double p = (num)*(100)/n;
				int P = (int)Math.round(p);
				
				
				System.out.println("Case #"+(i+1)+": "+A+" "+P+"%");
			}
		}
	
		sc.close();
	}
}