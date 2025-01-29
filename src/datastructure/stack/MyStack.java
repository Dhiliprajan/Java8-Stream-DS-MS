package datastructure.stack;

import java.util.*;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Orange");
        stack.push("Mango");
        stack.push("Lemon");
        stack.push("Guava");

        String myFav = stack.peek();
        System.out.println(myFav);
    }
}
