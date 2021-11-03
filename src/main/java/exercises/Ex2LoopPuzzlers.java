package exercises;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/*
 *  Some puzzlers
 *  General improvement of programming skills
 *
 *  See:
 *  - LoopPuzzler
 */
public class Ex2LoopPuzzlers {

    public static void main(String[] args) {
        new Ex2LoopPuzzlers().program();
    }


    void program() {
        // TODO Write solution (for loops) directly here
        int limit = 10;
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= limit; i++) {
            for (int l = 1; l <= limit; l++) {
                numbers.add(l*i);
            }
            out.println(numbers);
            numbers.clear();
        }
    }
}
