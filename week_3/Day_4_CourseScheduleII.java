//	Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3394/ 

public int[] findOrder(int numCourses, int[][] prerequisites) {
	Map<Integer, List<Integer>> adList = new HashMap<>();
	int []inD = new int[numCourses];
	int []outD = new int[numCourses];
       
	for (int i = 0; i < prerequisites.length; i++) {
		int dest = prerequisites[i][0];
		int src = prerequisites[i][1];
		List<Integer> list = adList.getOrDefault(src, new ArrayList<Integer>());
		list.add(dest);
		adList.put(src, list);
		inD[dest] += 1;
															        }
	Queue<Integer> q = new LinkedList<>();
	for (int i = 0; i < numCourses; i++)
		if (inD[i] == 0) 
			q.add(i);
	int i = 0;
	while (!q.isEmpty()) {
		int tmp = q.remove();
		outD[i++] = tmp;
		if (adList.containsKey(tmp)) {
			for (Integer node: adList.get(tmp)) {
				inD[node]--;
				if (inD[node] == 0)
					q.add(node);
			}
		}
	}
	if (i == numCourses)
		return outD;
	return new int[0];
}
