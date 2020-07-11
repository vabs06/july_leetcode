//  Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3387/

import java.util.*;

class Day_4_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        solve(nums, 0, result, sub);
        return result;
    }

    public void solve(int A[], int idx, List<List<Integer>> result, List<Integer> sub) {
        if (idx == A.length) {
            result.add(new ArrayList<Integer>(sub));
            return;
        }
        sub.add(A[idx]);
        solve(A, idx + 1, result, sub);
        sub.remove(sub.size() - 1);
        solve(A, idx + 1, result, sub);
    }
}