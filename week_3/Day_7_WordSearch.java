//  Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3397/

class Day_7_WordSearch {
    private boolean searchString(char[][] board, int i, int j, String word, int idx, int m, int n) {
        if (idx == word.length())
            return true;
        if (i < 0 || i > m - 1 || j < 0 || j > n - 1 || word.charAt(idx) != board[i][j])
            return false;
        board[i][j] = '-';
        boolean result = searchString(board, i, j + 1, word, idx + 1, m, n)
                || searchString(board, i, j - 1, word, idx + 1, m, n)
                || searchString(board, i + 1, j, word, idx + 1, m, n)
                || searchString(board, i - 1, j, word, idx + 1, m, n);
        board[i][j] = word.charAt(idx);
        return result;

    }

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (searchString(board, i, j, word, 0, m, n))
                    return true;
        return false;
    }
}