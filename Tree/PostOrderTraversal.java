// package Tree;

public class PostOrderTraversal {
    public static void main(String[] args) {
        
        System.out.println((char)0x950);
        TreeNode x = new TreeNode(5);
        x.left = new TreeNode(15);
        x.right = new TreeNode(100);
        x.left.left = new TreeNode(8);
        x.left.right = new TreeNode(12);
        x.right.left = new TreeNode(16);
        x.right.right = new TreeNode(25);
        postOrderWithRecursion(x);
    }
    static void postOrderWithRecursion(TreeNode t){
        if(t == null)
            return;
        else
            postOrderWithRecursion(t.left);
            postOrderWithRecursion(t.right);
            System.out.println(t.val);
    }
    static void postOrderWithoutRecursion(TreeNode t){
        
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
