// class Solution {
//     public int findContentChildren(int[] g, int[] s) {

//         boolean[] used = new boolean[s.length];
//         int count = 0;

//         for(int i = 0; i < g.length; i++) {

//             for(int j = 0; j < s.length; j++) {

//                 if(!used[j] && s[j] >= g[i]) {
//                     used[j] = true;
//                     count++;
//                     break;
//                 }
//             }
//         }

//         return count;
//     }
// }






import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;

        while(child < g.length && cookie < s.length) {

            if(s[cookie] >= g[child]) {
                child++;
            }

            cookie++;
        }

        return child;
    }
}