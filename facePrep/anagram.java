import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s =sc.nextLine();
    String t =sc.nextLine();
    char[] sa = s.toCharArray();
    char[] ta = t.toCharArray();
	Arrays.sort(sa);
	Arrays.sort(ta);
    if( new String(sa).equals(new String(ta)) )
     {
		System.out.println("Anagram");
     }
     else
   	{
		System.out.println("Not Anagram");
     }
  }
}
