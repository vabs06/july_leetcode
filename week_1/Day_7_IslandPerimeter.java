//  Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3383/

//  Solution contains both interative and recursive.
class Day_7_IslandPerimeter {
    int res;

    public void dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            res++;
            return;
        }
        if (grid[i][j] == -1)
            return;
        grid[i][j] = -1;
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        res = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j);
                    break;
                }
            }
        }

        /*
         * for (int i = 0; i < r; i++) { for (int j = 0; j < c; j++) { if (grid[i][j] ==
         * 1) { if (i == 0 || grid[i - 1][j] == 0) res++; if (j == 0 || grid[i][j - 1]
         * == 0) res++; if (i == r - 1 || grid[i + 1][j] == 0) res++; if (j == c - 1 ||
         * grid[i][j + 1] == 0) res++; } } }
         */
        return res;
    }
}