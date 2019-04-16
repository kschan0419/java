
public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum =0;
		int [][] arr = new int [10][10];
		for (int i=0; i<arr.length; i++){
			for (int j=0; j<arr[0].length; j++){
				arr [i][j] = (int)(Math.random()*10+1);
				System.out.print(arr[i][j]+" ");
				sum += arr[i][j];
			}
			System.out.println();
		}
		System.out.println("sum of all elements is equal to "+sum);
		
		int max =0;
		for (int i=0; i<arr.length; i++){
			int y=0;
			for (int j=0; j<arr[0].length; j++){
			y += arr[i][j];
			}
			if(y>max){
				max=y;
			}
			System.out.println("sum by rows "+(i+1)+" equal to "+y);
		}		
		
		int largest=0;
		for (int j=0; j<arr[0].length; j++){
			int x=0;
			for (int i=0; i<arr.length; i++){
			x += arr[i][j];
			}
			if(x>largest){
				largest=x;
			}
			System.out.println("sum of columns "+(j+1)+" equal to "+x);
		}
		System.out.println("row largest sum is "+max);
		System.out.println("column largest sum is "+largest);
		
	}

}
