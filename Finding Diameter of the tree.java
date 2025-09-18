//Given the root of a binary tree, return the length of the diameter of the tree.

//The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

//The length of a path between two nodes is represented by the number of edges between them.

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
    
    public int getDiameter(TreeNode root){
        getDepth(root);
        return max;
        
    }
    int max=0;
    private int getDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int left=getDepth(root.left);
        int right=getDepth(root.right);
        int cur=left+right;
        max=Math.max(max,cur);
        
        return Math.max(left,right)+1;
    }
    
    
    
//time complexity 
// o(n)
//space complexity 
//o(n) 
    
    
    
    
    
    
    
    
    
    
    
    
    
}