import java.io.*;
import java.lang.*;
class BillDemo
{
public static void main(String args[])
{
Products p=new Products();
int p1,p2,p3,T;
float f1,f2,F;
double d1,d2,D;
DataInputStream d=new DataInputStream(System.in);
try
  {
   System.out.println("BISMI SUPERMARKET");
   System.out.println("*****************");
   System.out.println("  BILL  ");
   System.out.println("------");
   System.out.println("Enter amount of product1:");
   p1=Integer.parseInt(d.readLine());
   System.out.println("Enter amount of product2:");
   p2=Integer.parseInt(d.readLine());
   System.out.println("Enter amount of product3:");
   p3=Integer.parseInt(d.readLine());
   T=p.Total(p1,p2,p3);
   System.out.println("Total Amount is::" +T);
   System.out.println("----------------");
   System.out.println("Enter amount of product1:");
   f1=Float.parseFloat(d.readLine());
   System.out.println("Enter amount of product2:");
   f2=Float.parseFloat(d.readLine());
   F=p.Total(f1,f2);
   System.out.println("Total Amount is::" +F);
   System.out.println("----------------");
   System.out.println("Enter amount of product1:");
   d1=Double.parseDouble(d.readLine());
   System.out.println("Enter amount of product2:");
   d2=Double.parseDouble(d.readLine());
   D=p.Total(d1,d2);
   System.out.println("Total Amount is::" +D);
   }
   catch(IOException e)
   {
    System.out.println(e);
   }
 }
}
class Products
{
	int Total(int a,int b,int c)
	{
		int d=a+b+c;
		return d;
	}
	float Total(float a,float b)
	{
		float s=a+b;
		return s;
	}
	double Total(double a,double b)
	{
		double s=a+b;
		return s;
	}
} 







































