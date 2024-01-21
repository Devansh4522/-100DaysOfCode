import java.util.HashMap;

public class str_longestSubsWithDistChar {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int i = 0;
        int j = 1;
        int count = 1;
        int max = 0;
        map.put(s.charAt(0), 1);
        while (j < n) {
            if (!map.containsKey(s.charAt(j)) || map.get(s.charAt(j)) == 0) {
                count++;
                map.put(s.charAt(j), 1);
                j++;
                max = Math.max(max, count);
            } else {
                map.put(s.charAt(i), 0);
                i++;
                count--;
            }
        }
        return max;
    }
}
