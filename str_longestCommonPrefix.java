class str_longestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String max = strs[0];

        for (int i = 0; i < strs.length - 1; i++) {
            String first = strs[i];
            String second = strs[i + 1];
            int j = 0;
            String length = "";
            while ((j < first.length()) && (j < second.length())) {
                if (first.charAt(j) == second.charAt(j)) {
                    length += first.charAt(j);
                    j++;
                } else {
                    break;
                }

            }
            if (length.length() <= max.length()) {
                max = length;
            }
        }
        return max;
    }
}
