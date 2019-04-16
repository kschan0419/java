import java.util.Scanner;

public class emirp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		
		int [] arr = new int[N];
		for(int i=1; i<=N; i++){
			int check = 0;
			for(int j=1; j<=i; j++){
				if(i%j==0){
					check++;
				}
			}
			if(check==2){
				arr[i-1]=i;
			}
		}
		
		int [] arr2 = new int[N];
		for(int i=1; i<=N; i++){
			if(arr[i-1]>0 && arr[i-1]<10){
				arr2[i-1]=arr[i-1];
			}
			else if(arr[i-1]>=10&&arr[i-1]<100){ //9999
				arr2[i-1]=(arr[i-1]/10)+(arr[i-1]%10*10);
			}
			else if(arr[i-1]>=100&&arr[i-1]<1000){
				arr2[i-1]=(arr[i-1]/100)+(arr[i-1]%10*100)+(arr[i-1]/10%10*10);
			}
			else if(arr[i-1]>=1000&&arr[i-1]<10000){
				arr2[i-1]=(arr[i-1]/1000)+(arr[i-1]%10*1000)+(arr[i-1]/100%10*100)+(arr[i-1]/10%10*10);
			}
		}
		
		int control = 1;
		for(int i=1; i<=N; i++){
			int check = 0;
			for(int j=1; j<=arr2[i-1]; j++){
				if(arr2[i-1]%j==0){
					check++;
				}
			}
			if(control<=100){
			if(check==2){
				System.out.println(arr[i-1]);
				control++;
			}
			}
		}
		System.out.println("now only got "+(control-1)+" numbers");
		
		sc.close();
	}

}
