public class ar_bs_split {
    class Solution {
        int possible(int[] nums, int x) {
            int parts = 1;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] <= x) {
                    sum += nums[i];
                } else {
                    sum = nums[i];
                    parts++;
                }
            }
            return parts;
        }

        public int splitArray(int[] nums, int k) {
            int max = nums[0];
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
                sum += nums[i];
            }
            int low = max;
            int high = sum;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (possible(nums, mid) <= k) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }
    }
}
