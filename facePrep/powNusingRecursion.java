import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int n=sc.nextInt();
    System.out.print("The value of "+a+ " power "+n+ " is " + pow(a,n));
  }
  public static int pow(int a,int n)
  {
    if(n==1)
      return a;
    else 
      return a*pow(a,n-1);
  }
}
