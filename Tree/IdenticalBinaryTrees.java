// package Tree;

/**
 * IdenticalBinaryTrees
 */
public class IdenticalBinaryTrees {

    public static void main(String[] args) {
        TreeNode x = new TreeNode(1);
        x.left = new TreeNode(2);
        x.right = new TreeNode(3);
        x.right.left = new TreeNode(4);
        x.right.left.right = new TreeNode(5);
        // x.right = new TreeNode(20);
        // x.left.left = new TreeNode(8);
        // x.left.right = new TreeNode(12);
        // x.right.left = new TreeNode(16);
        // x.right.right = new TreeNode(25);

        // 5 5 10 -1 -1 -1
        // 3 5 -1 -1
        TreeNode y = new TreeNode(1);
        y.left = new TreeNode(2);
        y.right = new TreeNode(3);
        y.right.left = new TreeNode(4);
        y.right.left.right = new TreeNode(5);
        // y.right = new TreeNode(10);
        // y.right = new TreeNode(20);
        // y.left.left = new TreeNode(8);
        // y.left.right = new TreeNode(12);
        // y.right.left = new TreeNode(16);
        // y.right.right = new TreeNode(25);
        
        Solution1 s1 = new Solution1();
        
        System.out.println(s1.solve(x, y));
    }
}
class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;
    

    TreeNode(int val) {
       this.val = val;
    }
}


class Solution1{

    
    public boolean isSameTree(TreeNode A, TreeNode B) {

        if(A == null && B == null)
            return true;

        return (A.val == B.val) && isSameTree(A.left, B.left) && isSameTree(A.right, B.right);
    }    

    public  int solve(TreeNode node1, TreeNode node2) {

        return isSameTree(node1, node2) ? 1 : 0;
    }

    // public static boolean isSameorNot(TreeNode node1, TreeNode node2) {

    //     if ((node1.left == null && node2.left == null) || (node1.right == null && node2.right == null))
    //         return true;
    //     if ((node1.left == null || node2.left == null) || (node1.right == null || node2.right == null))
    //         return false;

    //     if (node1.val == node2.val)
    //         return true;

    //     return isSameorNot(node1.left, node2.left) && isSameorNot(node1.right, node2.right);
    // }
}