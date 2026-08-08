class Solution {
    private int totalTilt = 0;

    public int findTilt(TreeNode root) {
        totalTilt = 0;
        calculateSubtreeSum(root);
        return totalTilt;
    }

    private int calculateSubtreeSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSum = calculateSubtreeSum(root.left);
        int rightSum = calculateSubtreeSum(root.right);

        totalTilt += Math.abs(leftSum - rightSum);

        return root.val + leftSum + rightSum;
    }
}