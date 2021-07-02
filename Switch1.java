package cond;
import java.util.*;
public class Switch1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	  System.out.println("Enter two numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	  System.out.println("Enter choice :");
	int ch = sc.nextInt();
	switch(ch)
	{
	case 1: System.out.println("Add = "+ (a+b));
	    break;
	case 2: System.out.println("Sub = "+ (a-b));
	    break;
	case 3: System.out.println("mult = "+ (a*b));
	    break;
	case 4: System.out.println("Div = "+ (a/b));
	    break;
	}
    S}
}
