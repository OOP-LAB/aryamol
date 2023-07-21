package graphics;
import java.util.Scanner;
interface area_cal
{
void area();
}
public class circle implements area_cal{
int radius;
public void area(){
Scanner sc = new Scanner(System.in);
System.out.println("input radius of the circle");
radius = sc.nextInt();
String area = Double.toString(Math.PI*radius*radius);
System.out.println("Area of the circle is:"+area);
sc.close();
}}
