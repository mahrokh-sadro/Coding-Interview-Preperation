// Given the root of a binary tree, invert the tree, and return its root.

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }

        TreeNode left=invertTree( root.left);
        TreeNode right=invertTree( root.right);
        root.left=right;
        root.right=left;
        return root;
    }
}


//time complexity
//o(n)
//space complexity
//o(h)