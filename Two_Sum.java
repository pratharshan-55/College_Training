
import java.util.*;
public class Two_Sum {
    public static void main(String args[]) {
        int[] nums={1,3,4,6,3,6,3,8,};
        int target =14;
        int[] a = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
      
       for(int i=0;i<a.length;i++){
         System.out.printlnclc(a[i]);
       }
         
    }
}