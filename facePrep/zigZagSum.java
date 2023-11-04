import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    int sum=0;
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
       a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(i==0 || i==r-1 || i+j==r-1)
        {sum+=a[i][j];}
      }
    }
    System.out.print("Sum of Zig-Zag pattern is "+sum);
  }
}
