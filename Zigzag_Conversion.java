public class Solution {
    public String convert(String s, int r) {
        if (r == 1 || r >= s.length()) {
            return s;
        }
        StringBuilder a = new StringBuilder();
        int c = 2 * (r - 1);
        for (int i = 0; i < r; i++) {
            for (int j = i; j < s.length(); j += c) {
                a.append(s.charAt(j));
                int d = j + c - 2 * i;
                if (i != 0 && i != r - 1 && d < s.length()) {
                    a.append(s.charAt(d));
                }
            }
        }
        return a.toString();
    }
}