public class str_atoiFunc {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int x = 1;
        String str = "";
        if (s.charAt(0) == '-') {
            x = -1;
        } else if (s.charAt(0) == '+') {
            x = 1;
        } else if (Character.isDigit(s.charAt(0))) {
            str += s.charAt(0);
        } else {
            return 0;
        }
        for (int i = 1; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                str += s.charAt(i);
            } else {
                break;
            }
        }
        if (str.length() == 0) {
            return 0;
        }
        try {
            int n = Integer.parseInt(str);
            n = x * n;
            return n;
        } catch (NumberFormatException e) {
            if (x == -1) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }

        }
    }

}
