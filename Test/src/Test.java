import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		MyDate test = new MyDate(0, 0, 0);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			
			int check = 0;
			
			int day = sc.nextInt();
			int month = sc.nextInt();
			int year = sc.nextInt();
			test.setDay(day);
			test.setMonth(month);
			test.setYear(year);
			test.getDay();
			test.getMonth();
			test.getYear();
			if(test.ValidDate()==true){
				check ++;
			}
			int n1 = 0;
			if(test.leapYear()==true){
				if(month==1){
					n1 += day;
				}
				else if(month==2){
					n1 += day+31;
				}
				else if(month==3){
					n1 += day+31+29;
				}
				else if(month==4){
					n1 += day+31+29+31;
				}
				else if(month==5){
					n1 += day+31+29+31+30;
				}
				else if(month==6){
					n1 += day+31+29+31+30+31;
				}
				else if(month==7){
					n1 += day+31+29+31+30+31+30;
				}
				else if(month==8){
					n1 += day+31+29+31+30+31+30+31;
				}
				else if(month==9){
					n1 += day+31+29+31+30+31+30+31+31;
				}
				else if(month==10){
					n1 += day+31+29+31+30+31+30+31+31+30;
				}
				else if(month==11){
					n1 += day+31+29+31+30+31+30+31+31+30+31;
				}
				else if(month==12){
					n1 += day+31+29+31+30+31+30+31+31+30+31+30;
				}
			}
			else{
				if(month==1){
					n1 += day;
				}
				else if(month==2){
					n1 += day+31;
				}
				else if(month==3){
					n1 += day+31+28;
				}
				else if(month==4){
					n1 += day+31+28+31;
				}
				else if(month==5){
					n1 += day+31+28+31+30;
				}
				else if(month==6){
					n1 += day+31+28+31+30+31;
				}
				else if(month==7){
					n1 += day+31+28+31+30+31+30;
				}
				else if(month==8){
					n1 += day+31+28+31+30+31+30+31;
				}
				else if(month==9){
					n1 += day+31+28+31+30+31+30+31+31;
				}
				else if(month==10){
					n1 += day+31+28+31+30+31+30+31+31+30;
				}
				else if(month==11){
					n1 += day+31+28+31+30+31+30+31+31+30+31;
				}
				else if(month==12){
					n1 += day+31+28+31+30+31+30+31+31+30+31+30;
				}
			}
			
			int day2 = sc.nextInt();
			int month2 = sc.nextInt();
			int year2 = sc.nextInt();
			test.setDay(day2);
			test.setMonth(month2);
			test.setYear(year2);
			test.getDay();
			test.getMonth();
			test.getYear();
			if(test.ValidDate()==true){
				check ++;
			}
			int n2 = 0;
			if(test.leapYear()==true){
				if(month2==1){
					n2 += day2;
				}
				else if(month2==2){
					n2 += day2+31;
				}
				else if(month2==3){
					n2 += day2+31+29;
				}
				else if(month2==4){
					n2 += day2+31+29+31;
				}
				else if(month2==5){
					n2 += day2+31+29+31+30;
				}
				else if(month2==6){
					n2 += day2+31+29+31+30+31;
				}
				else if(month2==7){
					n2 += day2+31+29+31+30+31+30;
				}
				else if(month2==8){
					n2 += day2+31+29+31+30+31+30+31;
				}
				else if(month2==9){
					n2 += day2+31+29+31+30+31+30+31+31;
				}
				else if(month2==10){
					n2 += day2+31+29+31+30+31+30+31+31+30;
				}
				else if(month2==11){
					n2 += day2+31+29+31+30+31+30+31+31+30+31;
				}
				else if(month2==12){
					n2 += day2+31+29+31+30+31+30+31+31+30+31+30;
				}
			}
			else{
				if(month2==1){
					n2 += day2;
				}
				else if(month2==2){
					n2 += day2+31;
				}
				else if(month2==3){
					n2 += day2+31+28;
				}
				else if(month2==4){
					n2 += day2+31+28+31;
				}
				else if(month2==5){
					n2 += day2+31+28+31+30;
				}
				else if(month2==6){
					n2 += day2+31+28+31+30+31;
				}
				else if(month2==7){
					n2 += day2+31+28+31+30+31+30;
				}
				else if(month2==8){
					n2 += day2+31+28+31+30+31+30+31;
				}
				else if(month2==9){
					n2 += day2+31+28+31+30+31+30+31+31;
				}
				else if(month2==10){
					n2 += day2+31+28+31+30+31+30+31+31+30;
				}
				else if(month2==11){
					n2 += day2+31+28+31+30+31+30+31+31+30+31;
				}
				else if(month2==12){
					n2 += day2+31+28+31+30+31+30+31+31+30+31+30;
				}
			}
			
			int d = 0;
			if((year2-year)>0){
				d += year2-year;
				if(test.leapYear()==true){
					n2 += 366*d;
				}
				else{
					n2 += 365*d;
				}
			}
			else if((year-year2)>0){
				d += year-year2;
				if(test.leapYear()==true){
					n1 += 366*d;
				}
				else{
					n1 += 365*d;
				}
			}
			
			//System.out.println(n1);
			//System.out.println(n2);
			
			if(check == 2){
					System.out.println("Case #"+i+": "+(n2-n1)+"days");
			}
			else{
				System.out.println("Case #"+i+": invalid");
			}
			
		}
		
		sc.close();
	}

}

class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int dd, int mm, int yy){
		day = dd;
		month = mm;
		year = yy;
	}
	
	void setDay(int dd){
		day = dd;
	}
	void setMonth(int mm){
		month = mm;
	}
	void setYear(int yy){
		year = yy;
	}
	
	int getDay(){
		return day;
	}
	int getMonth(){
		return month;
	}
	int getYear(){
		return year;
	}
	
	boolean leapYear(){
		if(year%4==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	boolean ValidDate(){
		if(year%4==0 && month==2 && (day>=1 && day<=29)){
			return true;
		}
		if(year%4!=0 && month==2 && (day>=1 && day<=28)){
			return true;
		}
		else if((month==1||month==3||month==5||month==7||month==8||month==10||month==12) && (day>=1 && day<=31)){
			return true;
		}
		else if((month==4||month==6||month==9||month==11) && (day>=1 && day<=30)){
			return true;
		}
		else{
			return false;
		}
	}
	
}