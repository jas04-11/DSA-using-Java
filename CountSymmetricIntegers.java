/*Example 1:

Input: low = 1, high = 100
Output: 9
Explanation: There are 9 symmetric integers between 1 and 100: 11, 22, 33, 44, 55, 66, 77, 88, and 99.
Example 2:

Input: low = 1200, high = 1230
Output: 4
Explanation: There are 4 symmetric integers between 1200 and 1230: 1203, 1212, 1221, and 1230.
 */


class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String str=Integer.toString(i);
            int len=str.length();

            if(len%2!=0) continue; //skip

            int half=len/2;
            int leftSum=0;
            int rightSum=0;

            for(int j=0;j<half;j++){
                leftSum+=str.charAt(j)-'0';//we can skip '0'
            }

            for(int j=half;j<len;j++){
                rightSum+=str.charAt(j)-'0';
            }
            if(leftSum==rightSum){
                count++;
            }


        }
        return count;
    }
}
