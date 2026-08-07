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
class Solution {
    private int ans;
    public int diameterOfBinaryTree(TreeNode root) 
    {
        /*if(root==null)
        return 0;

        int diameter_root = Solution.height(root.left) + Solution.height(root.right);

        int left_diameter = diameterOfBinaryTree(root.left);
        int right_diameter = diameterOfBinaryTree(root.right);
        
        return Math.max(diameter_root, Math.max(left_diameter, right_diameter));*/
        ans = 0;
        height(root);
        return ans;
        
    }

    private int height(TreeNode root)
    {
        if(root==null)
        return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        ans = Math.max(ans, leftHeight+rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
    }

}