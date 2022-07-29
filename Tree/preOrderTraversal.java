import java.util.ArrayList;
import java.util.Stack;

// package Tree;

public class preOrderTraversal {
    public static void main(String[] args) {
        
        System.out.println("babaji");
        TreeNode x = new TreeNode(5);
        x.left = new TreeNode(5);
        x.right = new TreeNode(100);
        x.left.left = new TreeNode(8);
        x.left.right = new TreeNode(12);
        x.right.left = new TreeNode(16);
        x.right.right = new TreeNode(25);
        preOrderTraversalWithoutRecursion(x);
        
    }
    static void preOrderTraversalWithoutRecursion(TreeNode t){
        Stack <TreeNode> stack = new Stack <> ();
        ArrayList<Integer> arr = new ArrayList<>();
        if(t != null){
            stack.push(t);
            while (!stack.isEmpty()) {
                arr.add(stack.peek().val);
                TreeNode temp = stack.pop();
                if(temp.right!=null)
                    stack.push(temp.right);
                if(temp.left != null)
                    stack.push(temp.left);
            }
        }
        System.out.println(arr);
    }

}

class TreeNode{

    int val;
    TreeNode left = null;
    TreeNode right = null;
    
    TreeNode(int val) {
       this.val = val;
    }
}