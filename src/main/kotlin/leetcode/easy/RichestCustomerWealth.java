package leetcode.easy;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = new int[][] {
                { 2, 8, 7 },
                { 7, 1, 3 },
                { 1, 9, 5 }
        };
        System.out.print(maximumWealth(accounts));
    }

    private static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int curCustomerWealth = 0;
        for (int[] account : accounts) {
            for (int funds : account) {
                curCustomerWealth += funds;
            }
            maxWealth = Math.max(maxWealth, curCustomerWealth);
            curCustomerWealth = 0;
        }
        return maxWealth;
    }
}
