       import java.util.*;
       public class Median_of_two_sorted_arrays{
        public static void main(String args[]){
       int[] nums1 = {1,2}; 
       int[] nums2 = {3,4};
        int m=nums1.length;
        int n=nums2.length;
        int[] ar=new int[n+m];
        System.arraycopy(nums1,0,ar,0,m);
        System.arraycopy(nums2,0,ar,m,n);
        Arrays.sort(ar);
        double b=0;
        if((m+n)%2!=0){
         b=ar[(m+n)/2];
        }
        else{
         b=(ar[(m+n)/2]+ar[(m+n)/2-1])/2.00000;
    
        }
       System.out.print(b);
        }
       }