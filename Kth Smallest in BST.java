// Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.


// public class TreeNode{
    
//     int val;
//     TreeNode left;
//     TreeNode right;
    
//     public TreeNode(){
        
//     }
    
//     public TreeNode(int val){
//         this.val=val;
//     }
    
//     public TreeNode(int val,TreeNode left,TreeNode right){
//         this.val=val;
//         this.left=left;
//         this.right=right;
//     }
// }


class Solution{
    int index=0;
    int value=0;
    public int getKthSmallest(TreeNode root,int k){
        dfs(root);
        return value;
    }
    
    public void dfs(TreeNode root,int k){
        if(root==null){
            return;
        }
        
        dfs(root.left,k);
        index++;
        if(index==k){
            value=root.val;
            return;
        }
        
        dfs(root.right,k);
    }
}


//time complexity
//o(n)
//space complexity
//o(h)




