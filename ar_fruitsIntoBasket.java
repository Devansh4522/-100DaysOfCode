import java.util.*;

class ar_fruitsIntoBasket {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        if (n <= 2) {
            return n;
        }

        int i = 0;
        int j = 0;
        int maxCount = 0;
        Map<Integer, Integer> fruitCount = new HashMap<>();

        while (j < n) {
            fruitCount.put(fruits[j], fruitCount.getOrDefault(fruits[j], 0) + 1);

            while (fruitCount.size() > 2) {
                fruitCount.put(fruits[i], fruitCount.get(fruits[i]) - 1);
                if (fruitCount.get(fruits[i]) == 0) {
                    fruitCount.remove(fruits[i]);
                }
                i++;
            }

            maxCount = Math.max(maxCount, j - i + 1);
            j++;
        }

        return maxCount;
    }
}