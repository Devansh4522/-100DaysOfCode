import java.util.*;

public class ar_removeduplicates {
    // brute force
    // first traverse in array and store every element in hash and then traverse in
    // hash and store every element in array again
    // not useful when answer is needed in sorted order
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            nums[i] = e.getKey();
            i++;
        }
        return map.size();
    }

    // optimal approach using 2-pointer
    public int removeDuplicates1(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {

    }
}