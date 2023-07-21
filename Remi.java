import java.util.Scanner;
class Remi
{
void add(int a,int b)
{
int c=a+b;
System.out.println("sum of two numbers is"+c);
}
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the first number");
int a=in.nextInt();
System.out.println("Enter the second number");
int b=in.nextInt();
remi o=new remi();
o.add(a,b);
}
}
