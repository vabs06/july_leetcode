//	Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3395/
public String addBinary(String a, String b) {
	if (a.length() == 1 && b.length() == 0)
		return a;
	if (a.length() == 0 && b.length() == 1)
		return b;
	StringBuilder result = new StringBuilder();				        
	int i = a.length() - 1;
	int j = b.length() - 1;
	int carry = 0;
	while (i >= 0 || j >= 0) {
		int res = carry;
		if (j >= 0) res += b.charAt(j--) - '0';
		if (i >= 0) res += a.charAt(i--) - '0';
		result.append(res % 2);
		carry = res / 2;
	}
	if (carry != 0)
		result.append(carry);
	return result.reverse().toString();
}
