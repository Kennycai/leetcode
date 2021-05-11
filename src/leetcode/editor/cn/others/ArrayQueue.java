package leetcode.editor.cn.others;

/**
 * 用数组实现一个固定长度的队列
 */
public class ArrayQueue {
    private final int[] arr;
    private int start = 0;
    private int end = 0;
    private int size = 0;

    public ArrayQueue(int size) {
        arr = new int[size];
    }

    public void push(int data) {
        if (!(size < arr.length)) {
            throw new ArrayIndexOutOfBoundsException("array out of index");
        }
        arr[end++] = data;
        size++;
        if (!(end < arr.length)) {
            end = 0;
        }
    }

    public int pop() {
        if (!(size > 0)) {
            throw new ArrayIndexOutOfBoundsException("no number");
        }
        int res = arr[start++];
        size--;
        if (!(start < arr.length)) {
            start = 0;
        }
        return res;
    }

    public int peek() {
        if (!(size > 0)) {
            throw new ArrayIndexOutOfBoundsException("no number");
        }
        return arr[start];
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.push(1);
        arrayQueue.push(2);
        arrayQueue.push(3);
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.peek());
        arrayQueue.push(4);

    }
}
