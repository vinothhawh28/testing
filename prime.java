import java.util.*;
public class prime {
public static void main(String[] args) {
int a,k=0;
Scanner in=new Scanner(System.in);
a=in.nextInt();
for(int i=2;i<a;i++){
	if(a%i==0){
		System.out.println("no");k++;break;
	}
}if(k==0){
	System.out.println("yes");
}
}
}
