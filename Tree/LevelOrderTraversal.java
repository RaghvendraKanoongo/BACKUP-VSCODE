// package Tree;

import java.util.LinkedList;
import java.util.Queue;

// import javax.swing.event.SwingPropertyChangeSupport;
// import javax.swing.tree.TreeNode;


public class LevelOrderTraversal {
    public static void main(String[] args) {
        System.out.println("Babaji");
        TreeNode x = new TreeNode(5);
        x.left = new TreeNode(5);
        x.right = new TreeNode(100);
        x.left.left = new TreeNode(8);
        x.left.right = new TreeNode(12);
        x.right.left = new TreeNode(16);
        x.right.right = new TreeNode(25);
        levelOrderTraversalWithoutRecursion(x);
    }

    static void levelOrderTraversalWithRecursion(TreeNode t){
        if(t == null ) 
            return ;
        System.out.println(t.val);
        levelOrderTraversalWithRecursion(t.left);
        levelOrderTraversalWithRecursion(t.right);
    }
    static void levelOrderTraversalWithoutRecursion(TreeNode t){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(t);
        while (!q.isEmpty()) {
            if(t.left != null)
                q.add(t.left);
            if(t.right != null)
                q.add(t.right);
            System.out.println(q.remove().val);
            t = q.peek();
        }
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

