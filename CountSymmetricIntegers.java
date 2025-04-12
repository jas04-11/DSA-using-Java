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
