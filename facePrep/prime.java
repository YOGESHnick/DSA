import java.util.*;
public class Main
{
  public static void main(String[] args)
  {  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (isPrime(n, 2))
      System.out.println("Prime Number");
   else
     System.out.println("Not a Prime Number");
   }
       static boolean isPrime(int n, int i)
    {
        if(i==1)
          return true;
        else{
          if(n%i==0)
            return false ;
          else
            return isPrime(n,i-1);
        }
    }
 }
