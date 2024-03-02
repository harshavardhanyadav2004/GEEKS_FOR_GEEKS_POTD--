class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : a)
        {
            if(!hm.containsKey(i))
            {
                hm.put(i,1);
            }
            else 
            {
                int val = hm.get(i);
                hm.put(i,val+1);
            }
            if(hm.get(i)==k)
            {
                return i;
            }
        }
        return -1;
    } 
}
