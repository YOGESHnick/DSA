import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int flag = 0;
    int arr[][] = new int[n][n];
    for(int i=0; i<n; i++)
    {
      for(int j=0; j<n; j++)
      {
        arr[i][j] = sc.nextInt();
      }
    }
    for(int i=0; i<n; i++)
    {
      for(int j=0; j<i; j++)
      {
        if(arr[i][j]!=0)
        {
          System.out.println("Not an Upper triangular matrix");
          flag = 1;
          break;
        }
      }
    }
    if(flag==0)
    {
      System.out.println("Upper triangular matrix");
    }
  }
}
