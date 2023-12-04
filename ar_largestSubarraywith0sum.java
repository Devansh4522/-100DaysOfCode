import java.util.HashMap;

public class ar_largestSubarraywith0sum {
    public class Solution {
        public static int getLongestZeroSumSubarrayLength(int[] A) {
            // Write your code here.
            HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

            int maxi = 0;
            int sum = 0;
            int n = A.length;

            for (int i = 0; i < n; i++) {

                sum += A[i];

                if (sum == 0) {
                    maxi = i + 1;
                } else {
                    if (mpp.get(sum) != null) {

                        maxi = Math.max(maxi, i - mpp.get(sum));
                    } else {

                        mpp.put(sum, i);
                    }
                }
            }
            return maxi;

        }
    }
}
