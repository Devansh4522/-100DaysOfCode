import java.util.HashMap;
import java.util.Map;

public class bit_twoNumsWithOddOcc {
    // public static int[] twoOddNum(int[] arr) {
    // int[] result = new int[2];

    // // Use a HashMap to count occurrences of each number
    // Map<Integer, Integer> occurrences = new HashMap<>();
    // for (int num : arr) {
    // occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
    // }

    // // Find the two numbers with odd occurrences
    // int index = 0;
    // for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
    // if (entry.getValue() % 2 != 0) {
    // result[index++] = entry.getKey();
    // }
    // }

    // // Return the result in decreasing order
    // if (result[0] < result[1]) {
    // int temp = result[0];
    // result[0] = result[1];
    // result[1] = temp;
    // }

    // return result;
    // }
    public static int[] twoOddNum(int[] arr) {
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }
        int rightmostSetBit = xor & -xor;
        int num1 = 0, num2 = 0;
        for (int num : arr) {
            if ((num & rightmostSetBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        return new int[] { num1, num2 };
    }
}
