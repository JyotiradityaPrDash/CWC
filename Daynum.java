import java.util.*;
public class Daynum{
	
	public static int leap(int y) {
		int feb;
		if(y % 400 == 0 || (y % 100 != 0 && y %4 == 0)) {
			feb = 29;
		}
		else {
			feb = 28;
		}
		return feb;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a date: ");
		String text = sc.nextLine();
  		String [] cutText = text.split("\\ ");
		
  		int date = Integer.parseInt( cutText[0] );
		String month = cutText[2];
		month = month.toLowerCase();

		int year = Integer.parseInt( cutText[3] );
		int feb=leap(year);
		int a = 31 , b = 30;

		if(month.equals("january"))
			System.out.println(date);
		
		else if(month.equals("february"))
			System.out.println(a+date);
		
		else if(month.equals("march"))
			System.out.println(a+feb+date);	
		
		else if(month.equals("april"))
			System.out.println((a*2)+feb+date);
		
		else if(month.equals("may"))			
			System.out.println((a*2)+b+feb+date);	
		
		else if(month.equals("june"))			
			System.out.println((a*3)+b+feb+date);	
		
		else if(month.equals("july"))			
			System.out.println((a*3)+(b*2)+feb+date);
		
		else if(month.equals("august"))			
			System.out.println((a*4)+(b*2)+feb+date);
		
		else if(month.equals("september"))			
			System.out.println((a*5)+(b*2)+feb+date);
		
		else if(month.equals("october"))			
			System.out.println((a*5)+(b*3)+feb+date);
		
		else if(month.equals("november"))			
			System.out.println((a*6)+(b*3)+feb+date);
		
		else if(month.equals("december"))
			System.out.println((a*6)+(b*4)+feb+date);

		}
		
	}