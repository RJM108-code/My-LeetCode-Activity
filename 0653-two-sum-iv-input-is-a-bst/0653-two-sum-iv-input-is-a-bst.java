/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public boolean findTarget(TreeNode root, int k) 
    {
        ArrayList<Integer> ar = new ArrayList<>();
        Solution.inOrder(root,ar);

        int left = 0, right = ar.size()-1;
        while(left<right)
        {
            int sum = ar.get(left)+ar.get(right);

            if(sum==k)
            return true;

            if(sum<k)
            left++;
            else
            right--;
        }

        return false;
        
    }

    public static void inOrder(TreeNode root, ArrayList<Integer> ar)
    {
        if(root==null)
        return;

        inOrder(root.left,ar);
        ar.add(root.val);
        inOrder(root.right,ar);
    }
}