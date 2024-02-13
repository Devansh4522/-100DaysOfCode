import java.util.HashMap;

public class ar_numOfSubsContGivenChar {
    public boolean check(HashMap<Character, Integer> mp) {
        return mp.getOrDefault('a', 0) > 0 && mp.getOrDefault('b', 0) > 0 && mp.getOrDefault('c', 0) > 0;
    }

    public int numberOfSubstrings(String s) {
        int count = 0;
        int i = 0;
        int j = 0;
        int n = s.length();
        HashMap<Character, Integer> mp = new HashMap<>();
        while (j < n) {
            mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0) + 1);

            while (check(mp)) {
                count += n - j;
                if (mp.get(s.charAt(i)) > 1) {
                    mp.put(s.charAt(i), mp.get(s.charAt(i)) - 1);
                } else {
                    mp.remove(s.charAt(i));
                }
                i++;
            }

            j++;
        }

        return count;
    }
}
