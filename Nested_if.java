package cond;
public class Nestd_if_else {
	public static void main(String[] args) {
		int age = 18;
		int weight = 40;
		if (age >= 18)
		{
		  if (weight >= 40)
			  System.out.println("Eligible");
		  else
			  System.out.println("Not eligible");
		}
		else
			System.out.println("Age should be more than 18");
	}
}
