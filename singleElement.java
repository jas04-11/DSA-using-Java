/*Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10
  */

class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        
        if(n==1) return arr[0];
        
        int low = 1;
        int high = n-2;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            if (n == 1) return arr[0];
            if (arr[0] != arr[1]) return arr[0];
            if (arr[n - 1] != arr[n - 2]) return arr[n - 1];

            
            if(arr[mid]!=arr[mid-1]  &&  arr[mid]!=arr[mid+1]) return arr[mid];
            
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
            //eliminate the left half:
            low = mid + 1;
            }
            //we are in the right:
            else {
            //eliminate the right half:
            high = mid - 1;
            }
            }
        return -1;
    }
}
