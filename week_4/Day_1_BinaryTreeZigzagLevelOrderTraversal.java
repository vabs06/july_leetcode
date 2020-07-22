// Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/547/week-4-july-22nd-july-28th/3398/

public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	List<List<Integer>> result = new ArrayList<>();
	if (root == null)   return result;
	Queue<TreeNode> q = new LinkedList<>();
	q.offer(root);
	boolean ltr = false;
	while (!q.isEmpty()) {
		List<Integer> sub = new ArrayList<>();
		int eleCount = q.size();
		for (int i = 0; i < eleCount; i++) {
			TreeNode tmp = q.poll();
			if (ltr)
				sub.add(0, tmp.val);
			else
				sub.add(tmp.val);
			if (tmp.left != null)
				q.add(tmp.left);
			if (tmp.right != null)
				q.add(tmp.right);
		}
		result.add(sub);
		ltr = !ltr;
	}
	return result;
}
