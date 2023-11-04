import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int dc=0;
    int n = sc.nextInt();
    System.out.println("The number of digits in "+n+" is "+nd(n,dc));
  }
  public static int nd(int n,int dc){
    if(n==0)
      return dc;
    else{
      dc++;
      n=n/10;
      return nd(n,dc);
    }
  }
}
