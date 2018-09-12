import java.lang.*;
import java.util.*;
class Factorial
{
public static void main(String args[])
{
int num;
int fact = 1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
num = sc.nextInt();
for(int i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("Factorial="+fact);
}
}

