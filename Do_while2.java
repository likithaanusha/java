package cond;
import java.util.*;
public class Do_while2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = "YES";
		do
		{
			System.out.println("enter stdnt_no: ");
			int stdnt_no = sc.nextInt();
			System.out.println("enter stdnt_name: ");
			String stdnt_name = sc.next();
			System.out.println("sno = "+stdnt_no);
			System.out.println("sname = "+stdnt_name);
  System.out.println("enter choice [Y/N] : ");
          ch = sc.next();
		}while(ch.equals("YES"));
		System.out.println("end of the data");
		}
}
