import java.util.Scanner;

public class c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int year[] = { 2008,2009,2010,2011,2012};
		
		
		double[][]arr = new double[5][12];
		for (int i=0; i<arr.length; i++){
			double highest = 0;
			int a = 0;
			double sum = 0;
			for (int j=0; j<arr[0].length; j++){
			arr[i][j]=sc.nextDouble();
			if (arr[i][j] >= highest){
				highest = arr[i][j];
				a = j;
			}
			sum += arr[i][j];
			}	
			
			double lowest = arr[i][0];
			int b = 0;
			for(int l =0;l<arr[0].length;l++){
			if (arr[i][l] <= lowest){
					lowest = arr[i][l];
					b = l;
				}
			}
			double average = sum/12;
			
			System.out.println("month with highest rainfall for year "+year[i]+" is "+(a+1));
			System.out.println("month with lowest rainfall for year "+year[i]+" is "+(b+1));
			System.out.println("average rainfall for year "+year[i]+" is "+average);
			System.out.print("month more than average rainfall for the year "+year[i]+" is ");
			int c=0;
			for (int k=0; k<arr[0].length; k++){
				if(arr[i][k]>average){
					c=k+1;
					System.out.print(c+" ");
				}
			}
			System.out.println();
			
		}		
		
		/*
		 3.19 7.44 3.82 7.42 3.99 7.03 2.41 8.17 5.30 10.21 17.82 16.27
		 4.93 0.75 1.16 3.09 4.53 2.52 7.89 3.74 5.80 3.93 33.19 17.31
		 4.05 0.47 0.73 2.47 1.00 6.67 3.00 1.06 2.41 10.65 14.17 15.17
		 15.84 1.80 8.09 1.32 0.43 8.60 6.50 4.29 4.00 10.66 21.43 12.97
		 8.88 0.17 3.74 2.35 6.65 1.89 3.39 2.21 6.41 2.63 2.93 26.58 
		 */
		sc.close();
	}

}
