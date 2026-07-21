package trees;
import java.util.*;

public class LC_0102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> mainList=new LinkedList<>();
        if(root==null){
            return mainList;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int queueSize=queue.size();
            List<Integer> partList=new LinkedList<>();
            for(int i=0;i<queueSize;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                partList.add(queue.poll().val);
            }
            mainList.add(partList);
        }
        return mainList;
    }
}
