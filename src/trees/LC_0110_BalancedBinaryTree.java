package trees;

public class LC_0110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {

        // 1.more Time Complexity -
        // if(root==null)return true;
        // int lh=maxDepth(root.left);
        // int rh=maxDepth(root.right);
        // if(Math.abs(lh-rh)>1)return false;

        // boolean left=isBalanced(root.left);
        // boolean right=isBalanced(root.right);
        // if(!left || !right)return false;
        // return true;

        // 2.
        if(root==null)return true;
        return maxDepth(root)!=-1;
    }
    public int maxDepth(TreeNode root){
        if(root==null)return 0;
        int lh=maxDepth(root.left);
        if(lh==-1 )return -1;
        int rh=maxDepth(root.right);
        if(rh==-1)return -1;
        if(Math.abs(lh-rh)>1)return -1;
        return 1+Math.max(lh,rh);
    }
}
