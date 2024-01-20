public class ar_rotateArrayByKsteps {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
        for (int i = 0; i < k / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[k - i - 1];
            nums[k - i - 1] = temp;
        }
        for (int i = k; i <= (n - 1 + k) / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - 1 - (i - k)];
            nums[n - 1 - (i - k)] = temp;
        }

    }
}
