package org.example.trees;

/*Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
  Return the number of good nodes in the binary tree.*/
public class CountGoodNodes {
    int count;
    public int goodNodes(TreeNode root) {
        count = 0;

        helper(root, root.val);

        return count;
    }

    public void helper(TreeNode root, int max){
        if (root != null) {
            if (root.val >= max) {
                count++;
                max = root.val;
            }

            helper(root.left, max);
            helper(root.right, max);
        }
    }
}
