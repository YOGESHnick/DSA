import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int top = 0;
        int[] stack = new int[n * n];
        
        while (true) {
            if (top == n) {
                System.out.println("Max size Reached!");
                break;
            }
            String operation = sc.next();

            if (operation.equals("push")) {
                int num = sc.nextInt();
                stack[top++] = num;
            } else if (operation.equals("pop")) {
                if (top > 0) {
                    top--;
                } else {
                    System.out.println("Stack is empty. Cannot pop.");
                }
            }
        }
        for (int i = 0; i < top; i++) {
            System.out.println("| " + stack[i] + " |");
            System.out.println("-----");
        }
    }
}
