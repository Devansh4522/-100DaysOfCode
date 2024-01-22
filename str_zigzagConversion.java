public class str_zigzagConversion {
    public String convert(String s, int numRows) {
        int n = s.length();
        if (numRows == 1) {
            return s;
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int index = i;
            int down = 2 * (numRows - 1 - i);
            int up = 2 * i;
            boolean d = true;
            while (index < n) {
                str.append(s.charAt(index));
                if (i == 0) {
                    index += down;
                } else if (i == numRows - 1) {
                    index += up;
                } else {
                    if (d) {
                        index += down;
                    } else {
                        index += up;
                    }
                    d = !d;
                }

            }

        }
        return str.toString();
    }
}
