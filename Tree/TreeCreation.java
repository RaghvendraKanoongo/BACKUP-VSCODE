// package Tree;

public class TreeCreation {


    public static void main(String[] args) {
        tree root = new tree(44);
        root.leftChild = new tree(22);
        root.rightChild = new tree(66);

        System.out.println(root.leftChild.leftChild == root.rightChild.rightChild);
        
    }
}

class tree{
    int data;
    tree leftChild;
    tree rightChild;
    tree root;

    tree(int n){
        
        data = n;
        leftChild = null;
        rightChild = null;
    }
    void insert(int n){
        
    }
}