//Is a given tree a BST


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