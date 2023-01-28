import java.io.*;
import java.util.*;
class Quadratic{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
System.out.println("Enter a,b,c");
double a= s. nextDouble();
double b= s. nextDouble();
double c= s. nextDouble();
double d= b*b-4*a*c;
if (d>0)
{
    double r1=(-b+ Math.pow(d,0.5) )/(2*a);
    double r2=(-b- Math.pow(d,0.5) )/(2*a);
    System.out.println("Roots are"+r1+","+r2);
}
else if (d==0)
{
    double r=(-b)/(2*a);
    System.out.println("Root is"+r);
} 
else 
System.out.println("Roots are imaginery");
}
}