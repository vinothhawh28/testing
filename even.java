import java.util.Scanner;
public class even {
public static void main(String[] args) {
int a,b;
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
for(int i=a+1;i<b;i++){
if(i%2==0){
	System.out.print(i+" ");
}
}
}
}
