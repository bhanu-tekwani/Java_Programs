import java.io.*;
import java.util.*;
class Avg
{
public static void main(String args[]) throws IOException
{
int sum=0,avg;
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);
int d = Integer.parseInt(args[3]);
int e = Integer.parseInt(args[4]);
sum = a+b+c+d+e;
avg = sum/5;
System.out.println("Average="+avg);
}
}
