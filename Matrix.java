import java.util.Scanner;
public class Matrix
{
public static void main(String[] args)
{
int row,col,i,j,flag=0;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of rows:");
row= in.nextInt();
System.out.println("enter the number of columns:");
col=in.nextInt();
int MAT1[][]=new int[row][col];
System.out.println("Enter the values");
for(i=0;i<row;i++)
for(j=0;j<col;j++)
MAT1[i][j]=in.nextInt();
for(i=0;i<row;i++)
for(j=0;j<col;j++)
if(MAT1[i][j]!=MAT1[j][i])
{
flag=1;
}
if(flag==1)
System.out.println("\nthe matrix is not symmetric");
else
System.out.println("\nthe matrix is symmetric");
}
}

