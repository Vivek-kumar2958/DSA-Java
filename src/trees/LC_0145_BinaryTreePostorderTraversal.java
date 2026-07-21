package trees;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class LC_0145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        // 1. using recursion
        //     List<Integer> result=new ArrayList<Integer>();
        //     postorder(root,result);
        //     return result;
        // }

        // public void postorder(TreeNode root,List<Integer> result){
        //     if(root==null)return;
        //     postorder(root.left,result);
        //     postorder(root.right,result);
        //     result.add(root.val);

        // using 2 stack -
        List<Integer> result = new ArrayList<>();
        if(root==null)return result;
        Stack <TreeNode>s1=new Stack<>();
        Stack <TreeNode>s2=new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
            root=s1.pop();
            s2.push(root);
            if(root.left!=null)s1.push(root.left);
            if(root.right!=null)s1.push(root.right);
        }
        while(!s2.isEmpty()){
            result.add(s2.pop().val);
        }
        return result;
    }
}
