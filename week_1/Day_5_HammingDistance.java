//  Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3381/

class Day_5_HammingDistance {
    public int hammingDistance(int x, int y) {
        int ans = x ^ y;
        int count = 0;
        while (ans != 0) {
            ans &= (ans - 1);
            count++;
        }
        return count;
    }
}