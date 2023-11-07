import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0); // Change '1' to '0' to get the first character

        if (Character.isUpperCase(c)) {
            System.out.print(1);
        } else if (Character.isLowerCase(c)) {
            System.out.print(0);
        } else {
            System.out.print(-1);
        }
    }
}
