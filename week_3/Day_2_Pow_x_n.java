//	Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3392/

class Day_2_Pow_x_n {
	public double myPow(double x, int n) {
		if (n == 0)
			return 1;
		if (n < 0) {
			x = 1 / x;
			return (n % 2 == 0) ? myPow(x * x, -(n / 2)) : x * myPow(x * x, -(n / 2));
		}
		return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
	}
}
