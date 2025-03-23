//Minimum In rotated sorted
/*Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
Example 2:

Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
Example 3:

Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 
*/

class Solution {
    public int findMin(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int mini=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;

            //additional optimization
            if(arr[low]<=arr[high]){
                mini=Math.min(mini,arr[low]);
                break;
            }
            if(arr[low]<=arr[mid]){//left soted
                mini=Math.min(mini,arr[low]);
                low=mid+1;
            }
            else{//right sorted
                mini=Math.min(mini,arr[mid]);
                high=mid-1;
            }
        }
        return mini; 
    }
}
