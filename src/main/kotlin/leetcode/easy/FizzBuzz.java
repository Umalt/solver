package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.print(fizzBuzz(15));
    }

    private static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        int i = 1;
        while (i <= n) {
            answer.add(
                    i % 15 == 0 ? "FizzBuzz" :
                            i % 3 == 0 ? "Fizz" :
                                    i % 5 == 0 ? "Buzz" :
                                            Integer.toString(i)
            );
            i++;
        }
        return answer;
    }
}
