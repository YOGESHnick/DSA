public class Solution {
	public static String isPrime(int num) {
		int flag=0;
		if (num==1){
			return "NO";
		}
		for (int i=2;i<Math.sqrt(num);i++){
			if (num%i==0){
				flag=1;
				break;
			}
		}
		if (flag==0){
			return "YES";
		}
		else{
			//System.out.println("NO");
			return "NO";
		}
		
	}
}
