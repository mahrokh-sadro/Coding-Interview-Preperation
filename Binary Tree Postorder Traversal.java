// Binary Tree Postorder Traversal

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        dfs(root,list);
        return list;
    }

    private void dfs(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }

        dfs(root.left,list);
        dfs(root.right,list);
        list.add(root.val);
    }
}
//time complexity
//o(n)
//space complexity
//o(n+h)