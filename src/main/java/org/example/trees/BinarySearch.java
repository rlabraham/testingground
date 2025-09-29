package org.example.trees;

public class BinarySearch {
    public static TreeNode binarySearch(TreeNode root, int key) {
        // Base Cases: root is null or key is present at
        // root
        if (root == null || root.val == key) {
            return root;
        }

        // Key is greater than root's key
        if (root.val < key) {
            return binarySearch(root.right, key);
        }

        // Key is smaller than root's key
        return binarySearch(root.left, key);
    }
}
