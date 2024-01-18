import java.util.*;

public class str_sortCharByFrequency {
    // public String frequencySort(String s) {
    // HashMap<Character, Integer> map = new HashMap<>();
    // for (char c : s.toCharArray()) {
    // map.put(c, map.getOrDefault(c, 0) + 1);
    // }
    // PriorityQueue<Character> maxheap = new PriorityQueue<>((a, b) -> map.get(b) -
    // map.get(a));
    // maxheap.addAll(map.keySet());
    // StringBuilder result = new StringBuilder();
    // while (!maxheap.isEmpty()) {
    // char current = maxheap.remove();
    // for (int i = 0; i < map.get(current); i++) {
    // result.append(current);
    // }
    // }
    // return result.toString();

    // }
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> e1, Map.Entry<Character, Integer> e2) {
                return e2.getValue() - e1.getValue();
            }
        });
        String str = "";

        for (Map.Entry<Character, Integer> e : list) {
            for (int i = 0; i < e.getValue(); i++) {
                str += e.getKey();
            }
        }
        return str;

    }
}
