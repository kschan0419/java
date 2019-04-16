import java.util.Scanner;
import java.text.DecimalFormat;

public class LinearEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		LinearEquationTester test = new LinearEquationTester();
		
		System.out.println("Enter the value for a,b,c,d,e, and f");
		System.out.print("Value a : ");
		double A = sc.nextDouble();
		System.out.print("Value b : ");
		double B = sc.nextDouble();
		System.out.print("Value c : ");
		double C = sc.nextDouble();
		System.out.print("Value d : ");
		double D = sc.nextDouble();
		System.out.print("Value e : ");
		double E = sc.nextDouble();
		System.out.print("Value f : ");
		double F = sc.nextDouble();
		
		test.getA(A);
		test.getB(B);
		test.getC(C);
		test.getD(D);
		test.getE(E);
		test.getF(F);
		
		boolean check = test.isSoluble();
		if (check==true){
			System.out.println("Value for X : "+df.format(test.getX()));
			System.out.println("Value for Y : "+df.format(test.getY()));
		}
		else if (check==false){
			System.out.println("The equation has no solution");
		}
		
		sc.close();
	}

}

class LinearEquationTester{
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public LinearEquationTester(){
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
	}
	
	double getA(double a1){
		a = a1;
		return a;
	}
	double getB(double b1){
		b = b1;
		return b;
	}
	double getC(double c1){
		c = c1;
		return c;
	}
	double getD(double d1){
		d = d1;
		return d;
	}
	double getE(double e1){
		e = e1;
		return e;
	}
	double getF(double f1){
		f = f1;
		return f;
	}

	boolean isSoluble(){
		if((a*d)-(b*c)!=0){
			return true;
		}
		else{
			return false;
		}
	}
	
	double getX(){
		return ((e*d)-(b*f))/((a*d)-(b*c));
	}
	
	double getY(){
		return ((a*f)-(e*c))/((a*d)-(b*c));
	}
	
}
