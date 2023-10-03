class Solution
{
    String colName (long n)
    {
        // your code here
        String str = "";
        
        while(n!=0)
        {
             long rem = n%26;
             
             
             if(rem==0)
             {
                 
                 str+='Z';
                 n=n/26-1;
             }
             else 
             {
                 n/=26;
                 str+=(char)(rem+64);
             }
             
        }
        StringBuilder sb = new StringBuilder(str);
        
        sb = sb.reverse();
        
        return sb.toString();
        
    }
}
