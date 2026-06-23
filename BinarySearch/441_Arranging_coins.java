class Solution {
    public int arrangeCoins(int n) {
        
        long low =1;
        long high = n;
        long j =0;
        while(low<=high){
           long mid = low+(high-low)/2;
           long ans = (mid*(mid+1)/2);
           if(ans<=n){
            j=mid;
            low=mid+1;
           }
           else{
            high=mid-1;
           }
        }
        return (int)j;

    }
}