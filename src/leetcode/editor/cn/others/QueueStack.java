package leetcode.editor.cn.others;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {
    private Queue<Integer> pushQueue;
    private Queue<Integer> popQueue;

    public QueueStack() {
        pushQueue = new LinkedList<>();
        popQueue = new LinkedList<>();
    }

    public void push(int data) {
        pushQueue.add(data);
    }

    public Integer pop() {
        for (int i = pushQueue.size(); i > 1; i--) {
            popQueue.add(pushQueue.poll());
        }
        Integer res = pushQueue.poll();
        swap();
        return res;
    }

    public Integer peek() {
        for (int i = pushQueue.size(); i > 1; i--) {
            popQueue.add(pushQueue.poll());
        }
        Integer res = pushQueue.poll();
        popQueue.add(res);
        swap();
        return res;
    }

    /**
     * 交换两个队列的引用
     */
    private void swap() {
        Queue<Integer> temp;
        temp = pushQueue;
        pushQueue = popQueue;
        popQueue = temp;
    }

    public static void main(String[] args) {
        QueueStack stack = new QueueStack();
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
