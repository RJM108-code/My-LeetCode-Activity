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
    public int getMinimumDifference(TreeNode root) 
    {
        List<Integer> s = new ArrayList<>();

        Solution.helper(root, s);
        int l = s.size();
        int minDiff = s.get(l-1);
        for(int i=0; i<l-1; i++)
        {
            int currDiff = s.get(i+1) - s.get(i);
            if(currDiff<minDiff)
            minDiff = currDiff;
        }

        return minDiff;
    }

    public static void helper(TreeNode root, List<Integer> s)
    {
        if(root==null)
        return;

        helper(root.left, s);

        s.add(root.val);

        helper(root.right, s);
    }
}