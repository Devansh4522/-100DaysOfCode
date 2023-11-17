public class ar_moveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;
        if (nums.length == 1) {
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
