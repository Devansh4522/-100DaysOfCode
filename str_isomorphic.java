import java.util.HashMap;

public class str_isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (!map.containsKey(sc)) {
                if (!map.containsValue(tc)) {
                    map.put(sc, tc);
                } else {
                    return false;
                }
            } else {
                char x = map.get(sc);
                if (x != tc) {
                    return false;
                }
            }
        }
        return true;
    }
}
