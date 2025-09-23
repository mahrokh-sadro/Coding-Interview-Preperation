// Binary Tree Inorder Traversal

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        dfs(root,list);
        return list;
    }

    private void dfs(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }

        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }
}

//time complexity
//o(n)
//space complexity
//o(n+h)