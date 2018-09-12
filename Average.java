import java.util.*;
import java.io.*;
class Average 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int sum = 0;
int i;
int n;
System.out.println("Enter max Number");
n = sc.nextInt();
int t[] = new int[n];
System.out.println("Enter numbers");
for(i=0;i<n;i++)
{
t[i] = sc.nextInt();
}
for(i=0;i<n;i++)
{
sum=sum+t[i];
}
double avg;
avg = sum/n;
System.out.println("Average"+avg);
}
}

