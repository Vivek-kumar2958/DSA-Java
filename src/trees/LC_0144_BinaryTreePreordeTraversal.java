package trees;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class LC_0144_BinaryTreePreordeTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        // 1.using recursion -
        //    List<Integer> result=new ArrayList<Integer>();
        //    preorder(root,result);
        //    return result;
        // }

        //    public void preorder(TreeNode root,List<Integer> result){
        //     if(root==null) return;
        //     result.add(root.val);
        //     preorder(root.left,result);
        //     preorder(root.right,result);
        //    }

        // 2. using stack -
        List<Integer>result=new ArrayList<>();
        if(root==null)return result;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            result.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }

        }
        return result;
    }
}
