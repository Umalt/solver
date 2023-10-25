package leetcode.easy;

public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.print(numberOfSteps(14));
    }

    private static int numberOfSteps(int num) {
        return steps(num, 0);
    }

    private static int steps(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return steps(num / 2, steps + 1);
        }
        return steps(num - 1, steps + 1);
    }
}
