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

    public static TreeNode TreeNodeGenerator(int depth) {
        TreeNode root = new TreeNode(0);
        int count = 1;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);

        while (depth != 1) {
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = qu.poll();
                node.left = new TreeNode(count++);
                node.right = new TreeNode(count++);
                qu.offer(node.left);
                qu.offer(node.right);
            }
            depth--;
        }

        return root;
    }

    public static void BFS(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);

        while (!qu.isEmpty()) {
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = qu.poll();
                System.out.print(node.val + " ");

                if (node.left != null) {
                    qu.offer(node.left);
                }

                if (node.right != null) {
                    qu.offer(node.right);
                }

            }
            System.out.println();
        }
    }
}