import java.util.Scanner;

public class KeepPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int i = 1;
		int positive = 0;
		int negative = 0;
		while(x!=0){
			
			if(x>0){
				positive++;
			}
			else{
				negative++;
			}
			
			x=sc.nextInt();
			i++;
		}
		
		System.out.println(positive+" "+negative);
		sc.close();
	}

}
