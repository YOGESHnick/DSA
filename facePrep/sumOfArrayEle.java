import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int i=0;
    System.out.print(sum(a,i,n));
  }
  public static int sum(int[] a,int i,int n)
  {
    if(i==n-1)
      return a[i];
    else 
      return a[i]+sum(a,i+1,n);
  }
}
