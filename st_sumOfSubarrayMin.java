import java.util.*;

public class st_sumOfSubarrayMin {
    class Solution {
        public int sumSubarrayMins(int[] arr) {
            int[] pre = prevSmaller(arr);
            int[] next = nextSmaller(arr);
            long count = 0;
            int mod = 1000000007;
            for (int i = 0; i < arr.length; i++) {
                long first = i - pre[i];
                long second = next[i] - i;
                long prod = (first * second) % mod;
                prod = (prod * arr[i]) % mod;
                count = (count % mod + prod) % mod;

            }
            return (int) count;

        }

        public int[] prevSmaller(int[] A) {
            Stack<Integer> st = new Stack<>();
            int n = A.length;
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {

                while ((!st.isEmpty()) && (A[st.peek()] > A[i])) {
                    st.pop();
                }

                if (!st.isEmpty()) {
                    ans[i] = st.peek();
                } else {
                    ans[i] = -1;
                }

                st.push(i);

            }
            return ans;
        }

        public int[] nextSmaller(int[] A) {
            Stack<Integer> st = new Stack<>();
            int n = A.length;
            int[] ans = new int[A.length];
            for (int i = n - 1; i >= 0; i--) {

                while ((!st.isEmpty()) && (A[st.peek()] >= A[i])) {
                    st.pop();
                }

                if (!st.isEmpty()) {
                    ans[i] = st.peek();
                } else {
                    ans[i] = n;
                }

                st.push(i);

            }
            return ans;
        }
    }
}

// public class st_sumOfSubarrayMin {
// public int sumSubarrayMins(int[] arr) {
// int length = arr.length;
// int[] left = new int[length];
// int[] right = new int[length];

// Arrays.fill(left, -1);
// Arrays.fill(right, length);

// Deque<Integer> stack = new ArrayDeque<>();

// for (int i = 0; i < length; ++i) {
// while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
// stack.pop();
// }
// if (!stack.isEmpty()) {
// left[i] = stack.peek();
// }
// stack.push(i);
// }

// stack.clear();

// for (int i = length - 1; i >= 0; --i) {
// while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
// stack.pop();
// }
// if (!stack.isEmpty()) {
// right[i] = stack.peek();
// }
// stack.push(i);
// }

// int mod = (int) 1e9 + 7;
// long answer = 0;

// for (int i = 0; i < length; ++i) {
// answer += (long) (i - left[i]) * (right[i] - i) % mod * arr[i] % mod;
// answer %= mod;
// }

// return (int) answer;
// }
// }
