//	Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3389/
class Day_6_SameTree{
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
	        if (p == null || q == null)
		       	return false;
		if (p.val != q.val)
			return false;
		return isSameTree(p.left, q.left)
			&& isSameTree(p.right, q.right);
	}
}
