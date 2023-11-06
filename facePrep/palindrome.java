import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int fp=0;int bp=s.length()-1;
    int f=0;
    while(fp<=bp)
    {
      if(s.charAt(fp) == s.charAt(bp) )
      {fp++;
      	bp--;}
      else
      {System.out.print("Not a Palindrome");
        f=1;
	    break;}
    }
    if(f==0)
      System.out.print("Palindrome");
  }
}
