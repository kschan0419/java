import java.util.Scanner;

public class BirthdayGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		if (N>0 && N<=100){

			int x = 1;
			
			while (N != 0){
				
				if (N!=0){
					
					int [] arr = new int[N];
					for (int a=0; a<N; a++){ 
						int dd = sc.nextInt();
						arr [a]= sc.nextInt();
						int yyyy= sc.nextInt();
					} 
					
					System.out.println("Case #"+x+":");
					
					for (int b=0; b<12; b++){ 
						if(b==0){
							System.out.print("Jan:");
						}
						else if(b==1){
							System.out.print("Feb:");
						}
						else if(b==2){
							System.out.print("Mar:");
						}else if(b==3){
							System.out.print("Apr:");
						}else if(b==4){
							System.out.print("May:");
						}else if(b==5){
							System.out.print("Jun:");
						}else if(b==6){
							System.out.print("Jul:");
						}else if(b==7){
							System.out.print("Aug:");
						}else if(b==8){
							System.out.print("Sep:");
						}else if(b==9){
							System.out.print("Oct:");
						}else if(b==10){
							System.out.print("Nov:");
						}else if(b==11){
							System.out.print("Dec:");
						} 
						
					for(int c=0; c<N; c++){ 
						if(arr[c]==(b+1)){
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
