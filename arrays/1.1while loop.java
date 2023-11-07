import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e=0;
		int o=0;
		while(n>0){
			int x = n%10;
			if(x%2==0){e=e+x;}
			else{o=o+x;}
			n=n/10;
		}   
		System.out.print(e+" "+o);
	}
}
