class Solution{
    int DivisibleByEight(String s){
        //code here
        if(s.length()==1)
        {
            if((s.charAt(0)-48)%8==0)
            {
                return 1;
            }
            return -1;
        }
        int sum = (s.charAt(1)-48)+(s.charAt(0)-48)*10;
        if(s.length()==2)
        {
            if(sum%8==0)
            {
                return 1;
            }
            return -1;
        }
         int sum1 = (s.charAt(s.length()-1)-48)+(s.charAt(s.length()-2)-48)*10+
         (s.charAt(s.length()-3)-48)*100;
         if(sum1%8==0)
         {
             return 1;
         }
         return -1;
    }
}
