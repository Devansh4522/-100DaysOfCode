import java.util.ArrayList;
import java.util.List;

public class ar_leaders {
    public static List<Integer> superiorElements(int[] a) {
        // Write your code here.
        int n = a.length;
        int max = a[a.length - 1];
        ArrayList<Integer> l = new ArrayList<>();
        l.add(a[n - 1]);
        for (int i = a.length - 2; i >= 0; i--) {
            max = Math.max(max, a[i]);
            a[i] = max;
            if (max != a[i + 1]) {
                l.add(max);
            }
        }
        if (l.size() == 0) {
            return null;
        }
        return l;
    }
}
