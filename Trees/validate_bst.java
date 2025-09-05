package Trees;

public class validate_bst {
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
    public void createBinaryTree() {
       
        TreeNode first = new TreeNode(4);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(6);
        TreeNode fourth = new TreeNode(1);
        TreeNode fifth = new TreeNode(3);
        TreeNode sixth = new TreeNode(5);
        TreeNode seventh = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }
public boolean isValid(TreeNode root,long min,long max)
{
if(root==null)
{
    return true;
}
if(root.data<=min||root.data>=max)
{
    return false;
}
boolean left=isValid(root.left, min, root.data);
if(left)
{
    boolean right=isValid(root.right, root.data, max);
    return right;
}
return false;
}
    public static void main(String[] args) {
    validate_bst tree = new validate_bst();
    tree.createBinaryTree();

    boolean result=tree.isValid(tree.root,Long.MIN_VALUE, Long.MAX_VALUE);
    System.out.println(result);
        
    }
    
}
