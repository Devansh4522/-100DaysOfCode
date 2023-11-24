import java.util.ArrayList;
import java.util.List;

public class ar_pascalsTriangle {

    class Solution {
        List<Integer> generateRow(int row) {
            List<Integer> list = new ArrayList<>();
            int ans = 1;
            for (int col = 0; col <= row; col++) {
                list.add(ans);
                ans = ans * (row - col) / (col + 1);
            }
            return list;
        }

        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> finalList = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                finalList.add(generateRow(i));
            }
            return finalList;
        }
    }

}
