import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a=0;
    int b=1;
    int n = sc.nextInt();int c=0;
    System.out.println("The term " +n+ " in the Fibonacci series is "+fib(a,b,c,n-1));
  } 
  public static int fib(int a,int b,int c,int n)
  {
    if(n==1) return c;
    else 
    {
      c=a+b;
      a=b;
      b=c;
      return fib(a,b,c,n-1);
    }
  }
}
