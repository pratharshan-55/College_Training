class Solution {
    public int searchInsert(int[] nums, int target) {
        int c = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                c = i;
                break;
            }
        }
        return c;
    }
}