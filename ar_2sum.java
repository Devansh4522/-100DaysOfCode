import java.util.HashMap;

public class ar_2sum {
    // Brute force
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];

                if (a + b == target) {
                    int[] arr = { i, j };
                    return arr;
                }

            }
        }
        return null;
    }

    // optimized approach using hashmap
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])) {
                int[] arr = { i, map.get(target - nums[i]) };
                return arr;
            }
        }
        return null;

    }
}
