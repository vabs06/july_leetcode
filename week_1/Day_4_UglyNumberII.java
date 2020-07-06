//  Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3380/

class Day_4_UglyNumberII {
    public int nthUglyNumber(int n) {
        if (n == 1)
            return 1;

        int dp[] = new int[n];
        dp[0] = 1;
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 1; i < n; i++) {
            int _2X = dp[x] * 2;
            int _3X = dp[y] * 3;
            int _5X = dp[z] * 5;
            dp[i] = Math.min(_2X, Math.min(_3X, _5X));
            if (dp[i] == _2X)
                x++;
            if (dp[i] == _3X)
                y++;
            if (dp[i] == _5X)
                z++;
        }
        return dp[n - 1];
    }
}