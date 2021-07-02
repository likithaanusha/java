package cond;
import java.util.*;
public class Switch2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter char:");
	String a = sc.next();
	switch(a)
	{
	case "a" : 
        case "e" : 
        case "i" : 
        case "o" :
	case "u" : System.out.println("Vowel"); break;
	default  : System.out.println("Not an vowel");
	}
	}
}
