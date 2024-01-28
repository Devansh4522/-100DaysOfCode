class ar_bs_NthRootUsingBS {

    public static int NthRoot(int n, int m) {
        int low = 1, high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((mid ^ n) == m) {
                return mid;
            } else if ((mid ^ n) < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}