import java.util.ArrayList;
import java.util.List;

///merge two sorted array and remove the duplicate elements
//find union of two arrays
public class ar_mergetwosortedarray {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        // Write your code here
        ArrayList<Integer> l = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                l.add(a[i]);
                i++;
            } else {
                l.add(b[j]);
                j++;
            }
        }
        while (i < n) {
            l.add(a[i]);
            i++;
        }
        while (j < m) {
            l.add(b[j]);
            j++;
        }
        i = 0;
        for (j = 1; j < l.size(); j++) {
            if (l.get(i) != l.get(j)) {
                l.set(i + 1, l.get(j));
                i++;
            }
        }
        l.subList(i + 1, l.size()).clear();
        return l;
    }
}
