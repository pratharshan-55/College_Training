class Solution {
    public int maxArea(int[] h) {
        int n = h.length;
        int l = 0;
        int r = n - 1;
        int m = 0;
        while (l < r) {
            int a;
            if (h[l] < h[r])
                a = h[l] * (r - l);
            else
                a = h[r] * (r - l);
            if (a > m)
                m = a;

            if (h[l] < h[r])
                l++;
            else
                r--;
        }
        return m;
    }
}