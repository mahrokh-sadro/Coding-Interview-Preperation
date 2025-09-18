// Given the root of a binary tree, determine if it is a valid binary search tree (BST).

// A valid BST is defined as follows:

//     The left 

// of a node contains only nodes with keys strictly less than the node's key.
// The right subtree of a node contains only nodes with keys strictly greater than the node's key.
// Both the left and right subtrees must also be binary search trees.


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(){};
    public TreeNode(int val){
        this.val=val;
    }
    public TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
    
    boolean isValid=true;
    TreeNode pre=null;
    public boolean isBST(TreeNode node){
        dfs(node);
        return isValid;
    }
    
    private void dfs(TreeNode node){
        if(node==null){
            return;
        }
        
        dfs(node.left);
        if(pre!=null && pre.val>=node.val){
            isValid=false;
            return;
        }
        pre=node;
        dfs(node.right);
        
    }
 
}

//time complexity 
//o(n)
//space complexity 
o(h)