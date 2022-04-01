package step2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MultiThreadCaller> callers = new ArrayList<MultiThreadCaller>();

        for (int i = 0; i < 10; i++) {
            callers.add(new MultiThreadCaller());
        }

        for (MultiThreadCaller caller: callers) {
            caller.start();
        }
    }
}