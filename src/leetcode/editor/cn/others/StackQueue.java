package leetcode.editor.cn.others;

import java.util.Stack;

/**
 * 用栈实现队列
 */
public class StackQueue {
    /**
     * 入栈
     */
    private final Stack<Integer> pushStack;
    /**
     * 出栈
     */
    private final Stack<Integer> popStack;

    public StackQueue() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }

    public void push(int data) {
        pushStack.add(data);
    }

    public Integer pop() {
        pour();
        if (popStack.empty()) {
            return null;
        }
        return popStack.pop();
    }

    public Integer peek() {
        pour();
        if (popStack.empty()) {
            return null;
        }
        return popStack.peek();
    }

    /**
     * 将push栈倒到pop栈，只有当pop栈没有东西的时候才可以倒
     */
    private void pour() {
        if (popStack.empty()) {
            while (!pushStack.empty()) {
                popStack.push(pushStack.pop());
            }
        }
    }

    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.push(1);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
    }
}
