
// Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.


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


class Solution {
    public List<Integer> getRightSideView(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
                if(i == size - 1) res.add(node.val);
            }
        }
        return res;
    }
}




//time complexity
//o(n)
//space complexity
//o(n)
