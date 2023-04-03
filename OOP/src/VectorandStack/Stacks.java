package VectorandStack;

import java.util.Enumeration;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<String>();

        stack.push("Java");
        stack.push("Python");
        stack.push("Php");
        stack.push("Go");

        for (String s : stack) {
            System.out.println(s);
        }

        Enumeration<String> enumeration = stack.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("-------------------------");

        System.out.println(stack.peek());

        System.out.println("Last Element Deleted: "+ stack.pop());

        for (String s: stack) {
            System.out.println(s);
        }
        System.out.println("-------------------------");

        System.out.println("Stack is empty? : "+stack.empty());

        System.out.println("-------------------------");

        while(!stack.empty()) {
            System.out.println("Element is take out: "+ stack.pop());
        }

    }

}
