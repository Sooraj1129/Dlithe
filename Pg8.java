import java.util.*;
class pattern
{ 
 public static void main(String[] args) 
 { 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the string:");
 String str=sc.next();
 int len = str.length();
 char ch[]=str.toCharArray();
 int a=0;
 for (int i = 1; i<len*2;i++) 
 {
 if(i==len)
    System.out.println(" ".repeat(a)+ch[a]+" ".repeat(a++));
 else
    System.out.println(" ".repeat(a)+ch[a]+" ".repeat((len-a)*2-3)+ch[a]+" ".repeat(a++));
 if(i>=len)
    a-=2;
 }
 }
}

