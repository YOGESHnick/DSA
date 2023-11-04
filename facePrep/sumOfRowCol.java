import java.util.*;
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int row[] = new int[r];
    int col[] = new int[c];
    int rs = 0, cs = 0;
    int maxInRow = 0;
    int maxInCol = 0;
    int a[][] = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        rs += a[i][j];
        cs += a[j][i];
      }
      row[i] = rs;
      col[i] = cs;
      rs = 0;
      cs = 0;
    }
    for (int i = 0; i < r; i++) {
      if (row[i] > maxInRow) {
        maxInRow = row[i]; 
      }
      if (col[i] > maxInCol) {
        maxInCol = col[i]; 
      }
    }
    int cpos = 0, rpos = 0;
    for (int i = 0; i < r; i++) {
      if (row[i] == maxInRow) {
        rpos = i;
        break;
      } 
    }
    for (int i = 0; i < c; i++) { 
      if (col[i] == maxInCol) {
        cpos = i;
        break;
      }
    }
    System.out.print("The Sum of rows is ");
    for (int i = 0; i < r; i++) {
      System.out.print(row[i] + " ");
    }
    System.out.println();
    System.out.println("Row "+rpos+" has a maximum sum ");
    System.out.print("The Sum of columns is ");
    for (int i = 0; i < c; i++) { 
      System.out.print(col[i] + " ");
    }
    System.out.println();
    System.out.println("Column "+cpos+" has a maximum sum ");
  }
}