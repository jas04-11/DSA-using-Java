//Input: nums = [1,3,5,6], target = 5
//Output: 2


class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low + (high-low)/2;
            if(nums[mid]>=target){          //or (target<=nums[mid])
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;

    }
}
