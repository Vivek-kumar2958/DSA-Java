package trees;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class LC_0094_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {

        // 1. using recursion-
        // List<Integer>result=new ArrayList<Integer>();
        // inorder(root,result);
        // return result;
        // }

        // public void inorder(TreeNode root,List<Integer> result){
        //     if(root==null)return;

        //     inorder(root.left,result);
        //     result.add(root.val);
        //     inorder(root.right,result);

        // 2 - using stack -

        List<Integer>result=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        while(true){
            if(root!=null){
                st.push(root);
                root=root.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                root=st.pop();
                result.add(root.val);
                root=root.right;
            }
        }
        return result;
    }
}
