
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
 
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p) return p;
        if(root == q) return q;
        if(root == null) return null;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

         if(left!= null && right != null) return root; //if both left and right are not null means one will be p and other will be q
        
        if(left == null){ // if left if null then right can be p or q
            return right;
        }else{
            return left;    // right == null ,  if right if null then left can be p or q
        }
    }
}