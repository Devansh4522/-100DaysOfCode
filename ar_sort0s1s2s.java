public class ar_sort0s1s2s {

    // Brute force
    public void sortColors1(int[] nums) {
        int z = 0, o = 0, t = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                z++;
            }
            if (nums[i] == 1) {
                o++;
            }
            if (nums[i] == 2) {
                t++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < z) {
                nums[i] = 0;
            }
            if (i >= z && i < z + o) {
                nums[i] = 1;
            }
            if (i >= z + o && i < z + o + t) {
                nums[i] = 2;
            }
        }
    }

    // Dutch National Flag Algorithm (Optimized)
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}
