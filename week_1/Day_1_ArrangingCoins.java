//  Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3377/

class Day_1_ArrangingCoins {
    public int arrangeCoins(int n) {
        return (int) ((Math.sqrt(8 * (long) n + 1) - 1) / 2);
    }
}