package Trees;

public class search_in_bst {
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
public TreeNode search(TreeNode root,int key)
{
    if(root==null||root.data==key)
    {
        return root;
    }
    if(key<root.data)
    {
        return search(root.left, key);
    }else{
        return search(root.right, key);
    }
}
    public boolean search(int key) {
        return search(root, key) != null;
    }
public static void main(String[] args) {
    search_in_bst bst=new search_in_bst();
    bst.insert(10);
    bst.insert(20);
    bst.insert(30);
    bst.insert(40);
    bst.insert(50);

    bst.printTree();
        int key = 80;
        if (bst.search(key)) {
            System.out.println("Key " + key + " found in BST.");
        } else {
            System.out.println("Key " + key + " NOT found in BST.");
        }

}
    
}
