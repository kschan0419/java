import java.util.Scanner;

public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int[][]hr = new int[8][7];
		
		int total =0;
		for (int i=0; i<hr.length; i++){
			for (int j=0; j<hr[0].length; j++){
			hr[i][j]=sc.nextInt();
			total += hr[i][j];
			}
		}
		System.out.println("total study hr of all students are "+total);
		
		int [] arr = new int [8];
		int max = arr[0];
		int a=0;
		int min = arr[0];
		int b=0;
		
		System.out.print("Student "); 
		for (int y=0; y<hr.length; y++){
			int sum=0;
			for (int x=0; x<hr[0].length; x++){
			sum += hr[y][x];
			}
			if(sum<25){
				System.out.print(y+" ");	
			}
			arr[y]=sum;
			if(arr[y]>max){
				max = arr[y];
				 a = y;
			}
			if(arr[y]<min){
				min = arr[y];
				 b = y;
			}
		}
		System.out.print("study less than 25 hr");
		System.out.println();
		System.out.println("Student "+a+" has the longest study hr while Student "+b+" has the shortest study hr");
		
		/*
		 2 4 3 4 5 8 8
		 7 3 4 3 3 4 4 
		 3 3 0 3 3 2 2
		 9 3 4 7 3 4 1
		 3 5 4 3 6 3 8
		 3 4 1 2 3 4 4
		 3 7 4 8 3 8 4
		 6 3 5 9 2 7 9
		 */
		sc.close();
	}

}
