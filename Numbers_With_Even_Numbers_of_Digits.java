class Solution {
    public int findNumbers(int[] nums) {
        //version 1:
        int t=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i]/2;
            if((a>=5 && a<=49) || (a>=500 && a<=4999) || (a>=50000 && a<=499999)){
                 t++;
            }
        }
        return t;
    }}
        
        //version 2
//           int tr=0;
//          for(int i=0;i<nums.length;i++){
//             if((((int)Math.log10(nums[i]))%2)!=0){
//                 tr++;
//             }
//          }
//           return tr;
//     }
// }