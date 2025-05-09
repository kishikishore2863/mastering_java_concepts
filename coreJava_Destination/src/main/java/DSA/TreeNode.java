package DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }
}


class Tree{
    int count;
    public static void main(String[] args) {
        TreeNode one  = new TreeNode(0);
        TreeNode two  = new TreeNode(5);
        TreeNode three  = new TreeNode(6);
        TreeNode four  = new TreeNode(7);
        TreeNode five  = new TreeNode(2);
        TreeNode six  = new TreeNode(11);
        TreeNode seven  = new TreeNode(12);
        TreeNode eight  = new TreeNode(13);

        TreeNode root = one;
        one.left = two;
        two.left = three;
        two.right = five;
        three.left = four;
        one.right = six;
        six.right = seven;
        seven.right = eight;

        Tree tree = new Tree();
        tree.postorderDfs(root);
        ArrayList<Integer> arrayList =new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
//        arrayList.clear();
        System.out.println(arrayList);
    }


    public void postorderDfs(TreeNode node) {
        if (node == null) {
            return;
        }

        count=count+1;
        System.out.println(count);
        postorderDfs(node.left);

    }
}
