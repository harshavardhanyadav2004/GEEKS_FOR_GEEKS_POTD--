class Solution
{
    public int maxSum(int n) 
    { 
        //code here.
        if(n==0)
        {
            return 0;
        }
        int sum = n/2+n/3+n/4;
        return Math.max(n,maxSum(n/2)+maxSum(n/3)+maxSum(n/4));
    } 
}
