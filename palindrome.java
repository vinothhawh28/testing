import java.util.Scanner;
public class vinoth {
	public static void main(String[] args) {
	int a;
	String b;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	String s=Integer.toString(a);
	StringBuffer sb=new StringBuffer(s);
	b=sb.reverse().toString();
	if(s.equals(b)){
		System.out.println("yes");
	}
	else
		System.out.println("No");
	
	}
	}

