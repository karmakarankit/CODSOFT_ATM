import java.util.*;
class Bank
{
double balance;
int acc_no;
Bank(int a,double b)
{
acc_no=a;
balance=b;
}
void deposite(double x)
{
balance=balance+x;
System.out.println(balance);
}
void withdrew(double y)
{
if(balance<1000)
{
System.out.println("incefficient balance");
}
else
{
balance=balance-y;
System.out.println(balance);
}
}

void display()
{
System.out.println(acc_no+"\t"+balance);
}
}

class X
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("enter your account number");
int a=ob.nextInt();
System.out.println("enter your balance");
double b=ob.nextDouble();
Bank obj=new Bank(a,b);
System.out.println("enter the amount you want to deposite");
double c=ob.nextDouble();
obj.deposite(c);
System.out.println("enter the amount you want to withdrew");
double d=ob.nextDouble();
obj.withdrew(d);

obj.display();
}
}