import java.util.*;
import java.io.*;
class vowels
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
int i,vow_count=0,char_count=0,char_space=0,digit=0,space=0;
char ch;
System.out.println("Enter A String");
str=sc.nextLine();
for(i=0;i<str.length();i++)
{
 ch=str.charAt(i);
 if(Character.toUpperCase(ch)== 'A' || Character.toUpperCase(ch) == 'E' || Character.toUpperCase(ch) == 'I' || Character.toUpperCase(ch) == 'O' ||  Character.toUpperCase(ch) == 'U')
vow_count++;
else if(Character.isSpaceChar(ch))
char_space++;
else if(Character.isDigit(ch))
digit++;
else if(Character.isSpace(ch))
space++;
else if(Character.isLetter(ch))
char_count++;
}
System.out.println("Vowels Count="+vow_count);
System.out.println("Character Count="+char_count);
System.out.println("Spaces="+char_space);
System.out.println("Digits="+digit);
System.out.println("Tabs="+space);
}
}
