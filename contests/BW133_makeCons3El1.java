public class BW133_makeCons3El1 {
    class Solution {
        int flip(int[] nums, int i) {
            if (nums[i] == 1) {
                return 0;
            }
            if (nums[i] == 0) {
                return 1;
            }
            return -1;
        }

        public int minOperations(int[] nums) {
            int count = 0;
            int n = nums.length;
            for (int i = 0; i < n - 2; i++) {
                if (nums[i] == 0) {
                    nums[i] = flip(nums, i);
                    nums[i + 1] = flip(nums, i + 1);
                    nums[i + 2] = flip(nums, i + 2);
                    count++;

                }
            }

            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    return -1;
                }
            }
            return count;

        }
    }
}
