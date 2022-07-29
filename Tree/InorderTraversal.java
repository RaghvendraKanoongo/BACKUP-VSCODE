import java.util.Stack;

import javax.swing.text.TableView.TableCell;

// package Tree;

public class InorderTraversal {
    
    public static void main(String[] args) {
        TreeNode x = new TreeNode(5);
        x.left = new TreeNode(15);
        x.right = new TreeNode(100);
        x.left.left = new TreeNode(8);
        x.left.right = new TreeNode(12);
        x.right.left = new TreeNode(16);
        x.right.right = new TreeNode(25);
        Solution s1 = new Solution();
        s1.inorderTraversal(x);
    }
}



class Solution{
    void inorderTraversal(TreeNode t){

        if(t == null){
            return;
        }
        else{
            inorderTraversal(t.left);
            System.out.println(t.val+" ");
            inorderTraversal(t.right);
        }
    }

    void inOrderwithoutRecursion(TreeNode t){
        Stack <TreeNode> stack = new Stack<>();
        stack.push(t);
        while (!stack.empty()) {
            TreeNode temp = null;
            if(t != null){
                stack.push(t.left);
                t = t.left;
            }
            if(t == null ) {
                temp = stack.pop();
                System.out.println(temp);
                t = temp.right;
            }
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
