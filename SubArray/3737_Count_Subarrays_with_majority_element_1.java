package SubArray;
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int length=0;
            int s=0;
            for(int j=i;j<nums.length;j++){
               length++;
               if(nums[j]==target) s++;
               if(s>length/2) count++;
            }
            
        }
        return count;
    }
}