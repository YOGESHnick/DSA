import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int r=sc.nextInt(),sum=0;
    int c=sc.nextInt();
    int a[][] = new int[r][c];
    int b[][] = new int[r][c];
	//int c[][] = new int[r][c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        b[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<r;i++){

      for(int j=0;j<r;j++)
      {
      sum=0;
        for(int k=0;k<c;k++){
        sum += a[i][k]*b[k][j];
      }
      System.out.print(sum+" ");
      }
      System.out.println();
    }
  }
}
