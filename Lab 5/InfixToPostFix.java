
// Implement a program to convert in-fix notation to post-fix notation using stack.
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix {

    public static int InputPrecedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        else if (ch == '*' || ch == '/')
            return 3;
        else if (ch == '^')
            return 6;
        else if (ch >= 'a' && ch <= 'z')
            return 7;
        else if (ch == '(')
            return 9;
        else if (ch == ')')
            return 0;
        return -1;
    }

    public static int StackPrecedence(char ch) {
        if (ch == '+' || ch == '-')
            return 2;
        else if (ch == '*' || ch == '/')
            return 4;
        else if (ch == '^')
            return 5;
        else if (ch >= 'a' && ch <= 'z')
            return 7;
        else if (ch == '(')
            return 0;
        return -1;
    }

    public static int Rank(char ch) {
        if (ch >= 'a' && ch <= 'z')
            return 1;
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Infix String : ");
        String Str = sc.next();
        Str = Str.toLowerCase();
        Str += ")";

        Stack<Character> stack = new Stack<Character>();
        stack.push('(');

        String Polish = "";
        int Rank = 0;

        for (int i = 0; i < Str.length(); i++) {
            char next = Str.charAt(i);
            while (StackPrecedence(stack.peek()) > InputPrecedence(next)) {
                char temp = stack.pop();
                Polish += temp;
                Rank += Rank(temp);
                if (Rank < 0) {
                    System.out.println("Invalid");
                    break;
                }
            }

            if (StackPrecedence(stack.peek()) != InputPrecedence(next))
                stack.push(next);
            else
                stack.pop();

        }
        if (Rank != 1 || !stack.empty())
            System.out.println("Invalid String ");
        else
            System.out.println("Valid String");
        System.out.println("Postfix  " + Polish);
        sc.close();
    }
}
