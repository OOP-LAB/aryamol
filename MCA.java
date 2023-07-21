import java.util.Scanner;
public class MCA
{
private String name;
private int rollno;
public MCA()
{
name="";
rollno=0;
}
public MCA(String name)
{
this.name="name";
rollno=0;
}
public mca(String name);
{
this.name="name";
rollno=0;
}
public MCA(String name,int rollno)
{
this.name="name";
this.rollno=rollno;
}
public void display()
{
System.outprintln("name:"+this.name);
System.out.println("rollno:"+this.rollno);
}
public static void main(String[] args)
{
mca s1=new mca("rameesa",39);
s1.display();
mca s2=new mca("rasheed",39);
s2.display();
}
}
