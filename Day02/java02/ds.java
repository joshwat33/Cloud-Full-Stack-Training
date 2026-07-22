package java02;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class stackex{
    stackex(){
        Stack<Integer> stack = new Stack<>();
        stack.push(82);
        stack.push(32);
        stack.push(25);

        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.get(0));

        System.out.println(stack);
        stack.clear();
        System.out.println(stack);
    }
}

class queuex{
    queuex(){
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(null)
    }
}
public class ds {
    public static void main(String[] args) {
        stackex st = new stackex();
    }
}
