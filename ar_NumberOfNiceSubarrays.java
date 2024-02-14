import java.util.HashMap;

public class ar_NumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int oddCount = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        while (j < nums.length) {
            if (nums[j] % 2 == 1) {
                oddCount++;
            }
            while (oddCount > k) {
                if (nums[i] % 2 == 1) {
                    oddCount--;
                }
                i++;
            }
            if (oddCount == k) {
                count += 1;
                int left = i;
                while (i < j && nums[i] % 2 == 0) {
                    count += 1;
                    i++;
                }
                i = left;
            }

            j++;
        }

        return count;
    }
}
