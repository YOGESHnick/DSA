import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(dec(n));
  }
  public static int dec(int n)
  {
    if(n==0)
      return 0;
    else
    {
      return n%2 + 10*dec(n/2);
    }
  }
}
