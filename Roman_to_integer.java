class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int res = hm.get(str.charAt(str.length()-1));
        
        for(int i=str.length()-2;i>=0;i--)
        {  
            int curr = hm.get(str.charAt(i));
            
            int succ = hm.get(str.charAt(i+1));
            
            if(curr<succ)
            {
                res-=curr;
            }
            else {
                res+=curr;
            }
        }
        return res;
        
    }
}
