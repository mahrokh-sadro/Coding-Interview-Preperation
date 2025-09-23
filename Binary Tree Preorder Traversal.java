// Binary Tree Preorder Traversal

class Solution {
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        dfs(root,list);
        return list;
    }

    private void dfs(TreeNode root,List<Integer> list ){
        if(root==null){
            return;
        }
        
        list.add(root.val);
        dfs(root.left,list);
        dfs(root.right,list);
    }
}

//time complexity
//o(n)
//space complexity
//o(n+h)


