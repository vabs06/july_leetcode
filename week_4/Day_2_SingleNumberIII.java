//  Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/547/week-4-july-22nd-july-28th/3399/
class Day_2_SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int i : nums)
            diff ^= i;
        diff &= -diff;
        int result[] = { 0, 0 };
        for (int i : nums) {
            if ((i & diff) == 0)
                result[0] ^= i;
            else
                result[1] ^= i;
        }
        return result;
    }

}

    // using Map

public int[] singleNumberUsingMap(int[] nums) {
    Map<Integer,Integer> mp = new HashMap<>();
        
        for(int k:nums){
            mp.put(k,mp.getOrDefault(k,0)+1);
        }
        int [] arr = new int[2];
        int cnt=0;
        for(int k:mp.keySet()){
            if(mp.get(k)==1){arr[cnt++]=k; }
        }
        
        return arr;
}