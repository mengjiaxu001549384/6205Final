package Mengjia;

public class Q2 {
    public boolean isFoldable(TreeNode node){
        if(node == null){
            return true;
        }

        return AreMirror(node.left, node.right);
    }

    public boolean AreMirror(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }

        if(node1 == null || node2 == null){
            return false;
        }

        return AreMirror(node1.left, node2.right) && AreMirror(node1.right, node2.left);
    }
}
