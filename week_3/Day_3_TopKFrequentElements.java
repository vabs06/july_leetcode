//	Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3393/
class Day_3_TopKFrequentElements {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> mp = new HashMap<>();		
		for(int key: nums)
			mp.put(key, mp.getOrDefault(key, 0) + 1);
		//  Using PQ;
	        PriorityQueue<Map.Entry<Integer, Integer>> pq = 			
  			new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));                              
		for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
			pq.offer(entry);
			if(pq.size() > k)
				pq.poll();
		}
		List<Integer> result = new ArrayList<>();
		while (!pq.isEmpty())
			result.add(pq.poll().getKey());
		Collections.reverse(result);
		int res[] = new int[k];
		int i = 0;
		for(int j: result)
			res[i++] = j;

		return res;                                                                                                                                                                                  }
}
