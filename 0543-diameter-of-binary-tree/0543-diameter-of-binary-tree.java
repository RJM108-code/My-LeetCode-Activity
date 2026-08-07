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
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if(root==null)
        return 0;

        int diameter_root = Solution.height(root.left) + Solution.height(root.right);

        int left_diameter = diameterOfBinaryTree(root.left);
        int right_diameter = diameterOfBinaryTree(root.right);
        
        return Math.max(diameter_root, Math.max(left_diameter, right_diameter));
    }

    public static int height(TreeNode root)
    {
        if(root==null)
        return 0;

        int leftHeight = Solution.height(root.left);
        int rightHeight = Solution.height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

}