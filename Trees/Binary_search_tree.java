package Trees;

public class Binary_search_tree {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        TreeNode(int data)
        {
            this.data=data;
        }
    }
    public TreeNode insert(TreeNode root,int value)
    {
        if(root==null)
        {
            root=new TreeNode(value);
            return root;
        }
        if(value<root.data)
        {
            root.left=insert(root.left, value);
        }else{
            root.right=insert(root.right, value);
        }
        return root;
    }
    public void insert(int value)
    {
        root=insert(root, value);
    }
        public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    } 

    public void printTree() {
        inorder(root);
        System.out.println();
    }
    public static void main(String[] args) {
    Binary_search_tree bst=new Binary_search_tree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(20);
        bst.insert(15);
        bst.insert(30);
        
    System.out.println("Inorder Traversal of BST:");
    bst.printTree();
    }
    
}
