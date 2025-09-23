// Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }

        return isTheSame(root.right,root.left);
    }

    private boolean isTheSame(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null || p.val!=q.val){
            return false;
        }

        return isTheSame( p.left, q.right) && isTheSame( p.right, q.left);
    }
        
}
//time complexity
//o(n)
//space complexity
//o(h)