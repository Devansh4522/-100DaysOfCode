class BW133_elDivBY3 {
    class Solution {
        public int minimumOperations(int[] nums) {
            int op = 0;
            for (int i = 0; i < nums.length; i++) {
                int x = nums[i] % 3;
                if (x == 1) {
                    op++;
                } else if (x == 2) {
                    op++;
                } else {
                    continue;
                }
            }
            return op;
        }
    }
}