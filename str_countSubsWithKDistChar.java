class str_countSubsWithKDistChar {
    public static long countAtleastK(String str, int n, int p) {
        int i, j, f = 0;
        int[] c = new int[26];
        long count = 0;
        for (i = 0; i < 26; i++) {
            c[i] = 0;
        }
        i = j = 0;
        for (i = 0; i < n; i++) {
            while (j < n && f < p) {
                c[str.charAt(j) - 97] += 1;
                if (c[str.charAt(j) - 97] == 1) {
                    f++;
                }
                j++;
            }
            if (f >= p) {
                count = count + n - j + 1;
            }
            c[str.charAt(i) - 97] -= 1;
            if (c[str.charAt(i) - 97] == 0) {
                f--;
            }
        }
        return count;
    }

    public static int countSubStrings(String str, int k) {
        int n = str.length();
        long ans = countAtleastK(str, n, k) - countAtleastK(str, n, k + 1);
        int a = (int) ans;
        return a;
    }
}