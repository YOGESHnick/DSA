import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]=new int[n];
    int max=0;int index=0;
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    System.out.println("Maximum element in the array is "+Max(arr,index,max,n));
  } 
  public static int Max(int[]a ,int i,int max,int n)
  {
    if(i==n) return max;
    else 
    {
      if(a[i]>max)
        max=a[i];
      return Max(a,i+1,max,n);
    }
  }
}
