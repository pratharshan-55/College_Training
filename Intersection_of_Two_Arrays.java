class Solution {
    public int[] intersection(int[] n1, int[] n2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> re = new HashSet<>();

        for (int n : n1) {
            s1.add(n);
        }

        for (int n : n2) {
            if (s1.contains(n)) {
                re.add(n);
            }
        }

        int[] ans = new int[re.size()];
        int i = 0;

        for (int n : re) {
            ans[i++] = n;
        }

        return ans;
    }
}