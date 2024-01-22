//User function Template for Java

/*Tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} 
*/

class Solution
{
    
    public static void printPaths_tree( ArrayList<ArrayList<Integer>> array,Node root , ArrayList<Integer> list,int sum)
    {
        if(root==null)
        {
            return ;
        }
        list.add(root.data);
        int fsum = 0;
        for(int i : list)
        {
            fsum+=i;
        }
        if(fsum==sum)
        {
            array.add(new ArrayList<>(list));
            
        }
        printPaths_tree(array,root.left,list,sum);
        printPaths_tree(array,root.right,list,sum);
        list.remove(list.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
       ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        printPaths_tree(array,root,list,sum);
        return array;
    }
}
