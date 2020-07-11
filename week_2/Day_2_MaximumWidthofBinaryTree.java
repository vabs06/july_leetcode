//  Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3385/

class Day_2_MaximumWidthofBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
        int maxWidth = 1;
        while (!q.isEmpty()) {
            while (!q.isEmpty() && q.getFirst() == null)
                q.removeFirst();
            while (!q.isEmpty() && q.getLast() == null)
                q.removeLast();
            maxWidth = Math.max(maxWidth, q.size());
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode tmp = q.poll();
                if (tmp == null) {
                    q.add(null);
                    q.add(null);
                } else {
                    q.add(tmp.left);
                    q.add(tmp.right);
                }
            }
        }
        return maxWidth;
    }
}