class Solution
{
    static int sum = 0;
    public static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right==null){
            sum+=root.data;
        }
        preOrder(root.left);
        preOrder(root.right);
        
    }
    public static int sumOfLeafNodes(Node root)
    {
        Solution.sum = 0;
        // code here 
        preOrder(root);
        return sum;
        
    }
}
