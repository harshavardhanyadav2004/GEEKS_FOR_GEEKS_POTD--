class Solution
{
    public int isPossible(int[][] paths)
    {
        // Code here
        for(int i[] : paths)
        {
            int sum = 0;
            for(int j : i)
            { sum+=j; }
            if(sum%2!=0)
            {
                return 0;
            }
        }
        return 1;
    }
}
