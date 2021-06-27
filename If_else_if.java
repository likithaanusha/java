package cond;
public class If_Else_If {
	public static void main(String[] args) {
		int marks = 95;
		if(marks < 35)
			System.out.println("Fail");
		else if (marks >=35 && marks < 50)
			System.out.println("C Grade");
		else if (marks >=50 && marks <60)
		    System.out.println("B Grade");
		else if (marks >=60)
			System.out.println("A Grade");
		else
			System.out.println("Invalid");
       }
}
