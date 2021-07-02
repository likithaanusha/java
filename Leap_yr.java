package cond;
import java.util.*;
public class Leap_yr 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the year ");
		int yr = sc.nextInt();
     if( ( (yr % 4 == 0) && (yr % 100 != 100) ) || (yr % 400 == 0))
      System.out.println(" Leap year = "+ yr);
     else
	  System.out.println(" Not a leap year = "+ yr);
	  }
}
