import java.util.Scanner;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/9/10
 */
public class WordSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        char[][] board=new char[m][n];


        for (int i = 0; i < m; i++) {
                board[i] = sc.next().toCharArray();
            }
        String word = sc.next();

        boolean res=exist(board,word);
        System.out.println(res);

    }
    public static  boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j, visited))
                    return true;
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, String word, int index, int rowindex, int colindex, boolean[][] visited) {
        if (index == word.length())
            return true;
        if (rowindex < 0 || colindex < 0 || rowindex >=board.length || colindex >= board[0].length)
            return false;
        if (visited[rowindex][colindex])
            return false;
        if (board[rowindex][colindex] != word.charAt(index))
            return false;
        visited[rowindex][colindex] = true;
        boolean res = dfs(board, word, index + 1, rowindex - 1, colindex,
                visited)
                || dfs(board, word, index + 1, rowindex + 1, colindex, visited)
                || dfs(board, word, index + 1, rowindex, colindex + 1, visited)
                || dfs(board, word, index + 1, rowindex, colindex - 1, visited);
        visited[rowindex][colindex] = false;
        return res;
    }

}

