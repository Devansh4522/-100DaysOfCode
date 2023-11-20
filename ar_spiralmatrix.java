import java.util.ArrayList;
import java.util.List;

public class ar_spiralmatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int top = 0, bottom = r, left = 0, right = c;
        ArrayList<Integer> list = new ArrayList<>();
        while (top < bottom && left < right) {
            for (int i = left; i < right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i < bottom; i++) {
                list.add(matrix[i][right - 1]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right - 1; i >= left; i--) {
                    list.add(matrix[bottom - 1][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom - 1; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
