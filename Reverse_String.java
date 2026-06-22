class Solution {
    public void reverseString(char[] s) {
        int p=s.length-1;
        for(int i=0;i<(s.length)/2;i++){
             char z=s[i];
             s[i]=s[p];
             s[p]=z;
             p--;
        }
    }
}