package recursion;

public class Word_Search {

    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        int index = 0;

        // First search the first character
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == word.charAt(index)) {
                    if (searchNext(board, word, i, j, index, m, n))
                        return true;
                }
            }
        }

        return false;

    }

    public static boolean searchNext(char[][] board, String word, int row, int col,
            int index, int m, int n) {
        if (index == word.length()) {
            return true;
        }
        // Checking the boundaries if the character at which we are placed is not
        // the required character
        if (row < 0 || col < 0 || row == m || col == n || board[row][col] != word.charAt(index)
                || board[row][col] == '!') {
            return false;
        }
        // this is to prevent reusing of the same character
        char c = board[row][col];
        board[row][col] = '!';

        // top
        boolean top = searchNext(board, word, row - 1, col, index + 1, m, n);
        // right
        boolean right = searchNext(board, word, row, col + 1, index + 1, m, n);

        // bottom
        boolean bottom = searchNext(board, word, row + 1, col, index + 1, m, n);

        // left
        boolean left = searchNext(board, word, row, col - 1, index + 1, m, n);
        board[row][col] = c; // undo change

        return top || right || bottom || left;
    }

    public static void main(String[] args) {
        char[][] board = { { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' } };

        String word = "ABCCED";

        Word_Search sol = new Word_Search();
        boolean res = sol.exist(board, word);
        System.out.println(res);
    }

}
