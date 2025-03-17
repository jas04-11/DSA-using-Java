/*Input: nums = [3,2,3,2,2,2]
Output: true
Explanation: 
There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.
*/

class Solution {
    public boolean divideArray(int[] nums) { //bit manipulation
        int n = nums.length;
        int xor1=0, xor2=0;
        
        for(int i=0;i<n;i++){
            xor1 = nums[i]^xor1;
            xor2 = (nums[i]+1)^xor2;
        }

        return xor1==0 && xor2==0;
    }
}
//or 
/*class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i+=2){
            if(nums[i]!=nums[i+1])
                return false;
        }
        return true;
    }
}*/
