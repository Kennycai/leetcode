package leetcode.editor.cn.others;

import java.util.Stack;

/**
 * 实现栈的getMin功能
 * 准备两个栈，minStack存储最小值，
 * 入stack的同时要入minStack，当minStack为空的时候直接入栈，minStack不为空的时候比较minStack最后一个数和当前数的大小，小的入minStack
 * 出栈的时候minStack和stack一起出，getMin的时候直接minStack.peek
 */
public class GetMinStack {
    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;

    public GetMinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int data) {
        if (minStack.empty()) {
            minStack.push(data);
        } else {
            minStack.push(Math.min(data, minStack.peek()));
        }
        stack.push(data);
    }

    public Integer pop() {
        if (this.stack.empty()) {
            throw new ArrayIndexOutOfBoundsException("The queue is empty");
        }
        minStack.pop();
        return stack.pop();
    }

    public Integer peek() {
        if (this.stack.empty()) {
            return null;
        }
        return stack.peek();
    }

    public Integer getMin() {
        if (this.minStack.empty()) {
            return null;
        }
        return minStack.peek();
    }

    public static void main(String[] args) {

    }
}
