class Solution {
    public int mySqrt(int x) {
        long ans=0;
        long low=0;
        long high=x;
        while(low<=high){
            long mid=low+(high-low)/2;
            long num = mid*mid;
            if(num<=x){
                ans=mid;
                low=mid+1;
            }
            else if(mid*mid>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return (int)ans;
    }
}