//program to reverse a string using stack

import java.util.Scanner;
import java.util.Stack;

public class reverseString {

    public static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c: chars) {
            stack.push(c);
        }
        for (int i = 0; i < str.length(); i++) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to reverse: ");
        String str = sc.next();
        System.out.println("Reversed String: "+ reverse(str));

    }
}
