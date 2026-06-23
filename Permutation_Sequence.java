class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> l = new ArrayList<>();
        int f = 1;
        for (int i = 1; i < n; i++){
             f *= i;
        }
        for (int i = 1; i <= n; i++){
             l.add(i);
        }
        k--;
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            int i = k / f;
            s.append(l.get(i));
            l.remove(i);
            k %= f;
            n--;
            if (n > 0){
            f /= n;
            }
        }
        return s.toString();
    }
}