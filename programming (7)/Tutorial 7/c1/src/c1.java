import java.util.Scanner;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		char[][] realans={{'D','B','D','C','C','D','A','E','A','D'}};
		
		char[][]ans=new char[9][10];
		for (int i=0; i<ans.length; i++){
			for (int j=0; j<ans[0].length; j++){
			ans[i][j]=sc.next(".").charAt(0);
			}
		}
			
		for (int y=0; y<ans.length; y++){
			double mark=0;
			for (int x=0; x<ans[0].length; x++){
				if(ans[y][x]==realans[0][x]){
					mark += 1;
				}
				else{
					mark -= 0.25;
				}
				}
			System.out.println("Student "+y+":"+mark);
		}
		
		/*
		 A B A C C D E E A D
		 D B A B C A E E A D
		 E D D A C B E E A D
		 C B A E D C E E A D
		 A B D C C D E E A D
		 B B E C C D E E A D
		 B B A C C D E E A D
		 E B E C C D E E A D
		 D B D C C D E E A D
		 */
		sc.close();
	}

}
