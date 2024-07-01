public class BW133_makeAllEl1 {
    class Solution {
        public int minOperations(int[] nums) {
            int ans = 0;
            boolean flag = true;
            for (int i = 0; i < nums.length; i++) {
                if ((nums[i] == 0 && flag) || (nums[i] == 1 && !flag)) {
                    ans++;
                    flag = !flag;
                }
            }
            return ans;
        }
    }

    // class Solution {
    // void flip(int[] nums, int i) {
    // for (int j = i; j < nums.length; j++) {
    // nums[j] = nums[j] == 0 ? 1 : 0;
    // }
    // }

    // public int minOperations(int[] nums) {
    // int count = 0;
    // int n = nums.length;

    // for (int i = 0; i < n; i++) {
    // if (nums[i] == 0) {
    // flip(nums, i);
    // count++;
    // }
    // }

    // // Verify if all elements are now 1
    // for (int i = 0; i < n; i++) {
    // if (nums[i] == 0) {
    // return -1;
    // }
    // }

    // return count;
    // }
    // }

}
