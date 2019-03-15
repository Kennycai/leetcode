package Hanio;

import java.util.*;

public class Test {

    public static void main (String[] args) {
        Stack<Integer> origin = new Stack<>();
        Stack<Integer> destination = new Stack<>();
        Stack<Integer> assist = new Stack<>();
        origin.addAll(Arrays.asList(1,2,3,4,5,6));
        Hanio h = new Hanio();
        h.Hanio(origin.size(), origin, assist, destination);
        System.out.println(destination.toString());
    }
}
