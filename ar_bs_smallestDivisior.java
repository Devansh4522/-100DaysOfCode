public class ar_bs_smallestDivisior {
    static int maxV(int[] v) {
        int ans = -1;
        for (int i = 0; i < v.length; i++) {
            ans = Math.max(ans, v[i]);
        }
        return ans;
    }

    static int resultN(int[] nums, int x) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += Math.ceil((double) nums[i] / (double) x);
        }
        return ans;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = maxV(nums);
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = resultN(nums, mid);
            if (result <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
