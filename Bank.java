import java.io.*;
import java.util.*;
class Bank
{
String cname;
int inbal;
float roi;
int cno;
String address;
void createAccount()
{
Scanner s = new Scanner(System.in);
Scanner a = new Scanner(System.in);
System.out.println("Enter Name");
cname = s.nextLine();
System.out.println("Enter Address");
address = s.nextLine();
System.out.println("Enter Phone number");
cno = a.nextInt();
System.out.println("Enter Initial Amount");
inbal = a.nextInt();
}
public void deposit()
{ 
int amt ;
Scanner s = new Scanner(System.in);
System.out.println("Enter AMount");
amt = s.nextInt();
inbal = inbal+amt;
}
public void withdraw()
{ 
int amt ;
Scanner s = new Scanner(System.in);
System.out.println("Enter Amount");
amt = s.nextInt();
if(amt<=inbal)
inbal = inbal-amt;
else
System.out.println("Not Enough Balance");
}
public void computeInterest()
{
Scanner s = new Scanner(System.in);
Scanner f = new Scanner(System.in);
int r=7,t;
System.out.println("Enter No of Year");
t = f.nextInt();
roi = inbal*r*t;
System.out.println("Interest = "+roi);
}
public void displayBalance()
{
System.out.println("MR."+cname+" your Balance is "+inbal);
}
public static void main(String args[])
{
int ch;
Bank b = new Bank();
Scanner z = new Scanner(System.in);
do
{
System.out.println("MENU\n1.Create Account\n2.Deposit\n3.Withdraw\n4.Interest\n5.Balance\n6.Exit\n");
ch = z.nextInt();
switch(ch)
{
case 1: b.createAccount();
break;
case 2: b.deposit();
break;
case 3: b.withdraw();
break;
case 4: b.computeInterest();
break;
case 5: b.displayBalance();
break; 
case 6: System.exit(0);
break;
default: System.out.println("Wrong Choice");
}
}while(ch!=6);
}
}
