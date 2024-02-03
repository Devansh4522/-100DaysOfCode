import java.util.Stack;

public class ar_st_asteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < asteroids.length) {
            if (asteroids[i] > 0) {
                st.push(asteroids[i]);
                i++;
            } else {
                if (st.size() == 0) {
                    st.push(asteroids[i]);
                    i++;
                } else {
                    if (st.peek() > 0) {
                        if (Math.abs(asteroids[i]) > st.peek()) {
                            st.pop();
                        } else if (Math.abs(asteroids[i]) < st.peek()) {
                            i++;
                        } else {
                            st.pop();
                            i++;
                        }
                    } else {
                        st.push(asteroids[i]);
                        i++;
                    }

                }

            }
        }
        int[] result = new int[st.size()];
        for (int j = result.length - 1; j >= 0; j--) {
            result[j] = st.pop();
        }
        return result;

    }
}
