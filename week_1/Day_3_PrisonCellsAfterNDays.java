//  Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3379/

class PrisonCellsAfterNDays {
    public int[] prisonAfterNDays(int[] cells, int N) {
        Map<String, Integer> seen = new HashMap<>();
        while (N > 0) {
            int cell[] = new int[8];
            seen.put(Arrays.toString(cells), N--);
            for (int i = 1; i < 7; ++i)
                cell[i] = cells[i + 1] == cells[i - 1] ? 1 : 0;
            cells = cell;
            if (seen.containsKey(Arrays.toString(cells)))
                N %= seen.get(Arrays.toString(cells)) - N;
        }
        return cells;
    }
}