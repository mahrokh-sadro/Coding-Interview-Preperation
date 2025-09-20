
// Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

// class TreeNode{
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
           List<List<Integer>> list=new ArrayList<>();
    if(root==null){
        return list;
    }
    
    Deque<TreeNode> deque=new LinkedList<>();
    deque.add(root);
    boolean isLeftToRight=true;
    
    while(!deque.isEmpty()){
        int size=deque.size();
        List<Integer> sublist=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode node;
            if(isLeftToRight){
                node=deque.pollFirst();
                if(node.left!=null){
                    deque.addLast(node.left);
                }
                if(node.right!=null){
                    deque.addLast(node.right);
                }
            }
            else{
                node=deque.pollLast();
                if(node.right!=null){
                    deque.addFirst(node.right);
                }
                if(node.left!=null){
                    deque.addFirst(node.left);
                }
            }
            sublist.add(node.val);
        }
        list.add(sublist);
        isLeftToRight=!isLeftToRight;
    }
    return list;
    }
}

//time complexity
//o(n)
//space complexity
//o(n)


