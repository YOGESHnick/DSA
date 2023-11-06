import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a>b)
       System.out.println(gcd(a,b));
    else 
       System.out.println(gcd(b,a));
  }
  public static int gcd(int a,int b){
    if(b!=0)
      return gcd(b,a%b);
    else{
      return a;
    }
  }
}
