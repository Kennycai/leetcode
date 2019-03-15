package Hanio;

import java.util.Stack;

/**
 * 汉诺塔问题
 */
public class Hanio {
    /**
     *
     * @param n 要移走的盘子数目
     * @param origin 初始盘
     * @param assist 辅助盘
     * @param destination 终点盘
     */
    public void Hanio (int n, Stack<Integer> origin, Stack<Integer> assist, Stack<Integer> destination) {
        if (n == 1) {
            move(origin, destination);
        } else {
            Hanio(n-1, origin, destination, assist);
            move (origin, destination);
            Hanio(n-1, assist, origin , destination);
        }
    }

    private void move(Stack<Integer> origin, Stack<Integer> destination) {
        destination.push(origin.pop());
    }
}
