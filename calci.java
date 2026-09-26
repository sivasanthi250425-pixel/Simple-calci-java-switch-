
import java.util.Scanner;

public class calci {
	public static void main(String [] arg) {
Scanner sc=new Scanner(System.in);
System.out.print("============");
System.out.print("Simple calci");
System.out.print("============");
int n1=sc.nextInt();
int n2=sc.nextInt();
char op;
int r=0;
System.out.print("enter op");
op=sc.next().charAt(0);
switch(op) {
case '+' -> r=n1+n2;
case '-' -> r=n1-n2;
case '*' -> r=n1*n2;
case '%' -> r=n1%n2;
case '/' -> r=n1/n2;
case '^' -> r=n1^n2;
default -> System.out.print("not applicable");
	
	
	
}System.out.print(r);



}
}
