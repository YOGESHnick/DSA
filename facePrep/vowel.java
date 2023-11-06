import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    s=s.toUpperCase();
    int c=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='A' ||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U' )
        c++;
    }
    System.out.print("Number of vowels: "+c);
  }
}
