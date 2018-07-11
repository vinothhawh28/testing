import java.util.Scanner;
public class range {
public static void main(String[] args) {
int a,n=0,c=0,temp;
Scanner in=new Scanner(System.in);
a=in.nextInt();
temp=a;
while(a>0){
n=a%10;
a=a/10;
c=c+(n*n*n);

}
if(temp==c){
	System.out.println("Yes");
}
else {
	System.out.println("No");
}
}
}
