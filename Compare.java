
class Solution {
    String printLargest(int n, String[] arr) {   
        Arrays.sort(arr,new Comparator<String>()
        {
            public int compare(String a , String b )
            {
                return  (a+b).compareTo(b+a);
            }
        });
        String str = "";
        for(int i = arr.length-1;i>=0;i--)
        {
            str+=arr[i];
        }
        return str;
        
    }
}
