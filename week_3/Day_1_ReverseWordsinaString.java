//  Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3391/

class Day_1_ReverseWordsinaString {
    private String solveForMe(String str[]) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i > 0; i--) {
            sb.append(str[i]);
            sb.append(" ");
        }
        return sb.append(str[0]).toString();
    }

    public String reverseWords(String s) {
        return solveForMe(s.trim().split("\\s+"));
    }
}