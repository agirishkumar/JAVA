import java.util.Scanner;
public class integertoDigit
{
public static void main(String args[])
{
int num, temp,digit,count=0;
Scanner sc = new Scanner (System.in);
System.out.println("Enter any number: ");
num = sc.nextInt();
sc.close();
temp=num;
while(num>0)
{
num=num/10;
count++;
}
while(temp>0)
{
digit=temp%10;
System.out.println("Digit at place "+count+" is: "+digit);
temp = temp / 10;
 count--;
}

}

}
