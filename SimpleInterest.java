import java.util.Scanner;
public class SimpleInterest
{
public static void main(String main[])
{
float p,r,t,si,amount;
Scanner sc = new  Scanner(System.in);
System.out.println("Enter the Principal");
p = sc.nextFloat();
System.out.println("Enter the Interest rate");
r = sc.nextFloat();
System.out.println("Enter the time period");
t=sc.nextFloat();
si=p*t*r/100;
System.out.println("Simple Interest ="+si);
amount=p+si;
System.out.println("Amount =" + amount);
}

}
