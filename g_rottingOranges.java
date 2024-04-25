class g_rottingOranges {
    class Solution {
        public int orangesRotting(int[][] grid) {
            Queue<int[]> q = new LinkedList<>();
            int row = grid.length;
            int col = grid[0].length;
            int min = 0;
            int countfresh = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (grid[i][j] == 2) {
                        q.offer(new int[] { i, j });
                    } else if (grid[i][j] == 1) {
                        countfresh++;
                    }
                }
            }
            if (countfresh == 0)
                return 0;
            int[][] path = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
            int count = 0;
            while (!q.isEmpty()) {
                count++;

                int size = q.size();
                while (size != 0) {
                    int[] t = q.remove();
                    for (int i = 0; i < 4; i++) {
                        int x = t[0] + path[i][0];
                        int y = t[1] + path[i][1];
                        if (x < 0 || y < 0 || y >= col || x >= row || grid[x][y] == 0 || grid[x][y] == 2)
                            continue;
                        grid[x][y] = 2;
                        q.offer(new int[] { x, y });

                        countfresh--;
                    }
                    size--;
                }
            }
            return countfresh == 0 ? count - 1 : -1;
        }
    }
}