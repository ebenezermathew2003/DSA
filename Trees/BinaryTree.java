package Trees;

public class BinaryTree {
    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data)
        {
            this.data=data;
        }
    }
    public void createBinaryTree()
    {
        TreeNode first=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode fourth=new TreeNode(4);
        TreeNode fifth=new TreeNode(5);

        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;

    }
    public void preOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
        public void preOrderTraversal() {
        preOrder(root);
        System.out.println();
    }
    public void inOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public  void inOrderTraversal()
    {
        inOrder(root);
        System.out.println();
    }
    public void postOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.right);
        postOrder(root.left);
        System.out.print(root.data+" ");
    }
    public void postOrderTraversal()
    {
        postOrder(root);
        System.out.println();
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();

        System.out.print("Preorder Traversal  ");
        bt.preOrderTraversal();

        System.out.print("InOrder Traversal  ");
        bt.inOrderTraversal();

        System.out.print("PostOrder Traversal  ");
        bt.postOrderTraversal();

    }
    
}
