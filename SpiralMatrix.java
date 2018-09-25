import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/9/11
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if(matrix.length == 0) return list;
        int max_row = matrix.length;
        int max_col = matrix[0].length;
        int totalNum = max_row * max_col;
        int col = 0; int row = 0; int counter = 0;
        boolean[][] flag = new boolean[max_row][max_col];
        while(counter < totalNum) {
            list.add(matrix[row][col]);
            flag[row][col] = true;
            if(col + 1 < max_col && !flag[row][col+1] && (row == 0 || flag[row-1][col])) {
                col++;
            }else if(row + 1 < max_row && !flag[row+1][col] && (col == max_col - 1|| flag[row][col+1])) {
                row++;
            }else if(col - 1 >= 0 && !flag[row][col-1] && (row == max_row - 1 || flag[row+1][col])) {
                col--;
            }else if(row - 1 >= 0 && !flag[row-1][col] && (col == 0 || flag[row][col-1])) {
                row--;
            }
            counter++;
        }
        return list;
    }
}
