package leetcode.editor.cn.others;

/**
 * 数组实现大小固定的栈
 */
public class ArrayStack {
    private final int[] arr;
    private int size = 0;

    public ArrayStack(int initSize) {
        arr = new int[initSize];
    }

    public void push(int data) {
        if (!(size < arr.length)) {
            throw new ArrayIndexOutOfBoundsException("the stack is full");
        }
        arr[size++] = data;
    }

    public Integer pop() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("The queue is empty");
        }
        return arr[--size];
    }

    public Integer peek() {
        if (!(size > 0)) {
            return null;
        }
        return arr[size - 1];
    }

    public static void main(String[] args) {

    }
}
