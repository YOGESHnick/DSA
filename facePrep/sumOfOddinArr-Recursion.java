import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s=0,index=0;
    int arr[]=new int[n];
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    System.out.println("Sum = "+sum(arr,index,s,n));
  } 
  public static int sum(int[]a ,int i,int s,int n)
  {
    if(i==n) return s;
    else 
    {
      if(a[i]%2==1 && a[i]>0)
      {
        s+=a[i];
      }
      return sum(a,i+1,s,n);
    }
  }
}
