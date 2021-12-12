package Mengjia;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        //Q1 Create a tree from Inorder and  level Order traversal
        System.out.println("Q1: ");

        System.out.println("Test case 1:");

        /*
        *            1
        *         /    \
        *       2        3
        *      /  \     /  \
        *    4     5  6     7
        *
        *   level order: 1,2,3,4,5,6,7
        *   inorder: 4,2,5,1,6,3,7
        *
        *
        */

        Q1 q1 = new Q1();
        int[] inOrder = new int[]{4,2,5,1,6,3,7};
        int[] levelOrder = new int[]{1,2,3,4,5,6,7};
        TreeNode node = q1.buildTree(inOrder, levelOrder);

        q1.printNode(node);

        System.out.println("Test case 2:");

        /*
         *            1
         *         /
         *        2
         *      /   \
         *    3      4
         *         /  \
         *        5    6
         *   level order: 1,2,3,4,5,6
         *   inorder: 3,2,5,4,6,1
         *
         *
         */
        int[] inOrder2 = new int[]{3,2,5,4,6,1};
        int[] levelOrder2 = new int[]{1,2,3,4,5,6};
        TreeNode node2 = q1.buildTree(inOrder2, levelOrder2);

        q1.printNode(node2);

        System.out.println("Test case 3:");

        /*
         *             1
         *              \
         *               2
         *                \
         *                 3
         *               /  \
         *              4    5
         *
         *
         *   level order: 1,2,3,4,5
         *   inorder: 1,2,4,3,5
         *
         *
         */
        int[] inOrder3 = new int[]{1,2,4,3,5};
        int[] levelOrder3 = new int[]{1,2,3,4,5};
        TreeNode nodeThree = q1.buildTree(inOrder3, levelOrder3);

        q1.printNode(nodeThree);

        System.out.println("================================================");
        //Q2 Check if a Tree is foldable

        System.out.println("Q2:");

        Q2 q2 = new Q2();

        System.out.println("Test case 1:");

        /*
               10
             /    \
            7      15
             \    /
              9  11
        */
        TreeNode node3 = new TreeNode(10);
        node3.left = new TreeNode(7);
        node3.right = new TreeNode(15);
        node3.left.right = new TreeNode(9);
        node3.right.left = new TreeNode(11);
        System.out.println(q2.isFoldable(node3));


        System.out.println("Test case 2:");

        /*
                    10
                   /  \
                  7   15
                 /    /
                5   11
        */
        TreeNode node4 = new TreeNode(10);
        node4.left = new TreeNode(7);
        node4.right = new TreeNode(15);
        node4.left.left = new TreeNode(5);
        node4.right.left = new TreeNode(11);
        System.out.println(q2.isFoldable(node4));


        //Q3 return the minimum number of jumps to reach the end of the array
        System.out.println("================================================");
        System.out.println("Q3:");

        Q3 q3 = new Q3();

        System.out.println("Test case 1:");
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(q3.minimumJump(arr));

        System.out.println("Test case 2:");
        int[] arr2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(q3.minimumJump(arr2));

        System.out.println("Test case 3:");
        int[] arr3 = {3, 2, 1, 0, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(q3.minimumJump(arr3));


        //Q4 return true if and only if the given words are sorted lexicographically in this alien language.
        System.out.println("================================================");
        System.out.println("Q4:");

        Q4 q4 = new Q4();

        System.out.println("Test case 1:");

        String[] words1 = {"hello","leetcode"};
        String order1 = "hlabcdefgijkmnopqrstuvwxyz";

        System.out.println(q4.alienLanguage(words1, order1));

        System.out.println("Test case 2:");

        String[] words2 = {"word","world","row"};
        String order2 = "worldabcefghijkmnpqstuvxyz";

        System.out.println(q4.alienLanguage(words2, order2));

        System.out.println("Test case 3:");

        String[] words3 = {"apple","app"};
        String order3 = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(q4.alienLanguage(words3, order3));

        System.out.println("Test case 4:");

        String[] words4 = {"zoo","zoa"};
        String order4 = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(q4.alienLanguage(words4, order4));
    }



}


