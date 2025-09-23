// Binary Tree Level Order Traversal

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }

        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            int size=que.size();
            List<Integer> sublist=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=que.poll();

                if(node.left!=null){
                  que.add(node.left);
                }
                if(node.right!=null){
                  que.add(node.right);
                }
                sublist.add(node.val);
                
            }
            list.add(sublist);
        }

        return list;
    }
}
//time complexity
//o(n)
//space complexity
//o(n)