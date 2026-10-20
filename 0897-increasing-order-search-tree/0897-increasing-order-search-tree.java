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
    public TreeNode increasingBST(TreeNode root) 
    {
        Stack<Integer> st = new Stack<>();
        helper(root, st);
        Stack<Integer> st2 = new Stack<>();

        while(!st.isEmpty())
        {
            st2.push(st.pop());
        }    

        TreeNode res = new TreeNode();

        TreeNode po = res;

        while(!st2.isEmpty())
        {
            po.right = new TreeNode(st2.pop());
            po = po.right;
        }

        return res.right;
    }

    public static void helper(TreeNode root, Stack<Integer> st)
    {
        if(root==null)
        {
            return;
        }

        helper(root.left, st);
        st.push(root.val);
        helper(root.right, st);
    }
}