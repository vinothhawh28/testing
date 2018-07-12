import java.util.*;
public class factorial {
public static void main(String[] args) {
int a;
int c=1,temp=0;
Scanner in=new Scanner(System.in);
a=in.nextInt();
for(int i=1;i<=a;i++){
	c=c*i;
	temp=c;
}
System.out.println(temp);
}
}
