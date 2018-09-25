import java.util.Scanner;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/9/10
 */
public class SurroundedRegions {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        char[][] board=new char[n][n];
        for (int i=0;i<n;i++){
            board[i]=sc.next().toCharArray();
        }
        if (board==null||board.length==0) return;
        int row = board.length;
        int col = board[0].length;
        for(int j=0;j<col;j++){
            dfs(board,0,j);
            dfs(board,row-1,j);        //第一行和最后一行
        }
        for(int i=1;i<row-1;i++){
            dfs(board,i,0);
            dfs(board,i,col-1);       //第一列和最后一列抛去和上一个循环相交的格子
        }

        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++){
                if (board[i][j]=='D') board[i][j] = 'O';
                else if (board[i][j]=='O') board[i][j] = 'X';
            }

        for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(board[i][j]);
                }
            System.out.println();
        }

    }

    public static void dfs(char[][] board, int x, int y){
        if (x<0||x>=board.length||y<0||y>=board[0].length||board[x][y]!='O') return;
        board[x][y] = 'D';
        dfs(board,x-1,y);
        dfs(board,x+1,y);
        dfs(board,x,y-1);
        dfs(board,x,y+1);
    }
}
