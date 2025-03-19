/*Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
*/

class Solution {
    public int search(int[] nums, int target) {
        return searchRotated(nums,target);
        }

        static int searchRotated(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[start]<=arr[mid]){ //left half sorted
                if(arr[start]<=target && target<arr[mid]){
                    //target lies
                    end=mid-1;
                }else{
                    //target does not lies
                    start=mid+1;
                }
            }else{ //right half sorted
                if(arr[mid]<target && target<=arr[end]){
                    //target lies
                    start=mid+1;
                }else{
                    //target does not lies
                    end=mid-1;
                }
            }

        }   
        return -1; 
        }
}
