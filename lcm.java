import java.util.*;
import java.io.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int lcm= (n>m)?n:m;
while(true)
{
if(lcm%n==0 && lcm%m==0)
{
System.out.println(lcm);
break;
}
++lcm;
}
}
}

