

 class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
    long maxSubarraySum(int arr[], int n){
    long currsum=0;
       long maxsum=Integer.MIN_VALUE;
       
       
       for(int i=0;i<n;i++){
           currsum+=arr[i];
           
           
           
         
           
           maxsum=Math.max(currsum,maxsum);
             if(currsum<0)
           currsum=0;
       }
        return maxsum;
    }
   
