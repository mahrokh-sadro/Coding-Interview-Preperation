//Finding Diameter of the tree

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