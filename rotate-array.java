class Solution {
    public void rotate(int[] nums, int k) {
        
        // to get the K number correct if its bigger than the nums in list
        /*
        Original List : 1 2 3 4 5 6 7       k=3
        reverse all nums: 7 6 5 4 3 2 1
        reverse first k nums: 5 6 7 4 3 2 1
        reverse last n-k nums: 5 6 7 1 2 3 4 -> result
        
        
        */
        
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
