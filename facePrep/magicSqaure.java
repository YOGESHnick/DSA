import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();int d1=0,d2=0;
    int a[][] = new int[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(i==j)
        {d1+=a[i][j];}
        if(j==n-i-1){
        d2+=a[i][j];}
      }
    }
    System.out.println((d1==d2)? "Yes":"No" );
  }
}
