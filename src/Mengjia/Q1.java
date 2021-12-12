package Mengjia;

import com.sun.source.tree.Tree;

import java.time.temporal.Temporal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Q1 {
    int levelOrderIndex = 0;
    public TreeNode buildTree(int[] inOrder, int[] levelOrder){
        Map<Integer, Integer> inOrderMap = new HashMap<>();
        Map<Integer, Integer> levelOrderMap = new HashMap<>();
        for(int i = 0; i < inOrder.length; i++){
            inOrderMap.put(inOrder[i], i);
            levelOrderMap.put(levelOrder[i], i);
        }

        return build(inOrder, levelOrder, 0, inOrder.length - 1, inOrderMap, levelOrderMap);
    }


    public TreeNode build(int[] inOrder, int[] levelOrder, int inOrderStart, int inOrderEnd, Map<Integer, Integer> inOrderMap, Map<Integer, Integer> levelOrderMap){
        if(inOrderStart > inOrderEnd){
            return null;
        }
        int val = -1;
        int rank = Integer.MAX_VALUE;

        for(int i = inOrderStart; i <= inOrderEnd; i++){
            if(levelOrderMap.get(inOrder[i]) < rank){
                val = inOrder[i];
                rank = levelOrderMap.get(inOrder[i]);
            }
        }

        TreeNode node = new TreeNode(val);

        node.left = build(inOrder, levelOrder, inOrderStart, inOrderMap.get(val) - 1, inOrderMap, levelOrderMap);
        node.right = build(inOrder, levelOrder, inOrderMap.get(val) + 1, inOrderEnd, inOrderMap, levelOrderMap);

        return node;

    }

    public void printNode(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i < size; i++){
                TreeNode cur = queue.poll();

                if(cur != null) {
                    System.out.print(cur.val + ", ");

                    queue.add(cur.left);
                    queue.add(cur.right);
                } else{
                    System.out.print("null, ");
                }
            }
            System.out.println();
        }
    }
}
