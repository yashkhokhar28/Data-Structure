import java.util.Scanner;
import java.util.Stack;

public class Evaluation_Prefix {
    public static int CheckCh(int op1, int op2, char ch) {
        int value = 0;
        if (ch == '+') {
            value = op1 + op2;
        } else if (ch == '-') {
            value = op1 - op2;
        } else if (ch == '*') {
            value = op1 * op2;
        } else if (ch == '/') {
            value = op1 / op2;
        } else if (ch == '^') {
            value = (int) Math.pow(op1, op2);
        }
        return value;
    }

    public static int EvalPrefix(String Prefix) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < Prefix.length(); i++) {
            char ch = Prefix.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int temp = (int) ch - 48;
                stack.push(temp);
            } else {
                int op1 = stack.pop();
                int op2 = stack.pop();
                int value = CheckCh(op1, op2, ch);
                stack.push(value);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Prefix String : ");
        String Prefix1 = sc.nextLine();
        String Prefix = "";
        for (int i = Prefix1.length()-1; i >= 0; i--) {
            Prefix += Prefix1.charAt(i);
        }
        System.out.println(EvalPrefix(Prefix));
        sc.close();
    }
}