import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/9/12
 */
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int row=0;int col=0;
        int rowlen=matrix.length-1;int collen=matrix[0].length-1;

        while(row<=rowlen&&col<=collen) {
            for (int j = col; j <= collen; j++) {
                list.add(matrix[row][j]);
            }

            for(int i=row+1;i<=rowlen;i++){
                list.add(matrix[i][rowlen]);
            }

            if(rowlen>row&&collen>col){
                for(int j=collen-1;j>col;j--){
                    list.add(matrix[rowlen][j]);
                }
                for(int i=rowlen;i>row;i--){
                    list.add(matrix[i][row]);
                }
            }
            row++;col++;rowlen--;collen--;

        }
        return list;

    }

}




