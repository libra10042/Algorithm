package src.com.example.bfs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x){
        this.val = x;
    }
}

public class LevelOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        solve(root);
    }

    public static List<List<Integer>> solve(TreeNode root){
        // 1. ds
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // 2. for, while add Algorithm
        while(!queue.isEmpty()){ // 2,3
            int size = queue.size(); // 2
            List<Integer> list = new ArrayList<>();

            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                list.add(node.val); // 1, 2, 3
                if(node.left != null){
                    queue.offer(node.left); //4
                }
                if(node.right != null){
                    queue.offer(node.right); //5
                }
            }
            result.add(list);
        }
        return result;
    }

}
