import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {

    }

    public static List<Integer> BFS(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);

        while (!qu.isEmpty()) {
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = qu.poll();
                list.add(node.val);

                if (node.left != null) {
                    qu.offer(node.left);
                }

                if (node.right != null) {
                    qu.offer(node.right);
                }

            }
        }

        return list;
    }
}