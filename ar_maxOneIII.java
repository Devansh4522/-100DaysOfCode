import java.util.HashMap;

public class ar_maxOneIII {
    public int longestOnes(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int len = 0;
        int i = 0;
        int j = 0;
        int maxL = 0;
        int n = nums.length;
        while (j < n) {
            if (nums[j] == 1) {
                mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
                j++;
                len++;
                maxL = Math.max(maxL, len);
            } else {
                if (k != 0) {
                    mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
                    k--;
                    j++;
                    len++;
                    maxL = Math.max(maxL, len);
                } else {
                    if (nums[i] == 1) {
                        mp.put(nums[i], mp.getOrDefault(nums[i], 0) - 1);
                        len--;
                        i++;
                    } else {
                        mp.put(nums[i], mp.getOrDefault(nums[i], 0) - 1);
                        len--;
                        i++;
                        k++;
                    }
                }
            }
        }
        return maxL;
    }
}
