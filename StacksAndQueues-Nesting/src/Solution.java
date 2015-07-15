// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    int head, tail =0;

    int N;

    String parens[] = new String[1000000];

    public int solution(String S) {
        // write your code in Java SE 8

        N = S.length();
        int opens=0, closes =0;

        for (int i=0; i < N; i++) {
            String val = S.substring(i, i+1);

            if (val.equals("(")) {
                opens++;
            } else {
                closes++;
            }

            // WARNING: producing output may seriously slow down your code!
//            System.out.println(String.format("%s %d %d", val, opens, closes));

            if (closes > opens) {
                return 0;
            }
        }

//            System.out.println(String.format("%d %d", opens, closes));
        return opens == closes ? 1 :0;
    }
    // correctness 66% performance 0%, overall 25%
    public int solution1(String S) {
        // write your code in Java SE 8

        N = S.length();

        for (int i=0; i < N; i++) {
            String val = S.substring(i, i+1);

            if (val.equals("(")) {
                push(val);
            } else {
                pop();
            }

            // WARNING: producing output may seriously slow down your code!
            System.out.println(String.format("%s %d %d", val, head, tail));

            if (head > tail) {
                return 0;
            }
        }

        return 1;
    }

    String pop() {
        head = (head + 1) % N;
        return parens[head];
    }

    void push(String val) {

        tail = (tail + 1) % N;
        parens[tail] = val;
    }
}