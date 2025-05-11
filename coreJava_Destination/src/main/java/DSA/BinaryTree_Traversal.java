package DSA;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree_Traversal {
    public static void main(String[] args) {
        TreeNode zero = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode two = new TreeNode(2);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);

        TreeNode root = zero;
        zero.left = one;
        one.left = three;
        one.right =four;
        zero.right =two;
        two.right=five;
        five.right =six;

        List<Integer> preOrderList = new ArrayList<>();
        preOrder(root,preOrderList);
        System.out.println("preOrderList"+preOrderList);


        List<Integer> postOrderList = new ArrayList<>();
        postOrder(root,postOrderList);
        System.out.println("postOrderList"+postOrderList);

        List<Integer> inOrderList = new ArrayList<>();
        inOrder(root,inOrderList);
        System.out.println("inOrderList"+inOrderList);

    }

    public static void preOrder(TreeNode node, List<Integer> list){
        if(node == null){

            return;
        }
        list.add(node.val);
        preOrder(node.left,list);
        preOrder(node.right,list);
    }

    public static void postOrder(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        postOrder(node.left,list);
        postOrder(node.right,list);
        list.add(node.val);
    }

    public static void inOrder(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        inOrder(node.left,list);
        list.add(node.val);
        inOrder(node.right,list);
    }
}
