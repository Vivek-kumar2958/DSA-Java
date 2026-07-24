package trees;

public class LC_124_BinaryTreeMaximumPathSum {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        mps(root);
        return max;
    }
    public int mps(TreeNode root){
        if(root==null)return 0;
        int maxL=Math.max(0,mps(root.left));
        int maxR=Math.max(0,mps(root.right));
        max=Math.max(max,root.val+maxL+maxR);
        return root.val+Math.max(maxL,maxR);
    }
}
