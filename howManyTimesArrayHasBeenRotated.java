/*
Example 1:
Input Format:
 arr = [4,5,6,7,0,1,2,3]
Result:
 4
Explanation:
 The original array should be [0,1,2,3,4,5,6,7]. So, we can notice that the array has been rotated 4 times.
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
