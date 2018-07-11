import java.util.Scanner;
public class odd {
public static void main(String[] args) {
int a,b,k=0;
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
for(int i=a+1;i<b;i++){
	for(int j=2;j<i;j++){
	if(i%j==0){
		k=0;
		break;}
	else{
		k=1;}
	}
	if(k==1){
		System.out.print(i+" ");
	}
}
}
}
