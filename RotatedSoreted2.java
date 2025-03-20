/*Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
*/

class Solution {
    public boolean search(int[] nums, int target) {
        return searchRotated(nums,target);
    }
    static boolean searchRotated(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            //if target exists
            if(arr[mid]==target) return true;

            //edge cases
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                start = start + 1;
                end = end - 1;
                continue;
            }

            //left part sorted
            if(arr[start]<=arr[mid]){
                if(arr[start]<=target && target<=arr[mid]){
                    //target lies
                    end=mid-1;
                }else{
                     //target not lies
                   start=mid+1;
                }

            }else{
                if(arr[mid]<=target && target<=arr[end]){
                    //target lies                    
                    start=mid+1;
                }else{
                    //target not lies
                   end=mid-1;
                }
            }
     }
     
    return false;
    }
}
 
