import java.util.Scanner;

public class question6F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		if (T>=1 && T<=100){
			for (int i=0; i<T; i++){
				
				int x = sc.nextInt();
				if (x>=1 && x<=6){
					int [] arr = new int [200];
					int j=0;
					while (x!=(-1)){
						arr[j]=x;
						x = sc.nextInt();
						j++;
					}
					
					int face[] = new int[6];
					for (int l=0; l<6; l++){
						face[l]=0;
					}
					for(int k=0; k<j; k++){
						if(arr[k]==1){
							face[0]++;
						}
						else if(arr[k]==2){
							face[1]++;
						}
						else if(arr[k]==3){
							face[2]++;
						}
						else if(arr[k]==4){
							face[3]++;
						}
						else if(arr[k]==5){
							face[4]++;
						}
						else if(arr[k]==6){
							face[5]++;
						}
					}
					System.out.println("Case #"+(i+1)+":");
					for (int a=1; a<=6; a++){
						System.out.println("Face "+a+":"+face[(a-1)]);
					}
				}
				
			}
		}
	sc.close();	
	}

}
