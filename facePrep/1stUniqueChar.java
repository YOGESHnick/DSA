import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int flag=0;
    char c;
    int a[]=new int[256];//indices of this array will be characters!
    for(int i=0;i<s.length();i++)
    {
      a[s.charAt(i)]++;   //a[t]++; a[e]++ like this...
    }
    for(int i=0;i<s.length();i++)
    {
      if(a[s.charAt(i)]==1)
      {
        c=s.charAt(i);
        System.out.print(c);
       flag=1;
      	break;}
    }
    if(flag==0)
      System.out.print("All the characters are repetitive");
  }

}
