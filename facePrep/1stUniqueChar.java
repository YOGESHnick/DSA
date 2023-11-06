import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int f=0;
    for(int i=0;i<s.length();i++)
    {
      char letter=s.charAt(i);
      if(s.indexOf(letter)==s.lastIndexOf(letter))
      {System.out.print(letter);
      	f=1;
      	break;}
    }
   if(f==0)
     System.out.print("All the characters are repetitive");
  }
}
