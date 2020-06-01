package tree.binaryTree.bianli;

import tree.binaryTree.BinaryTree;
import tree.binaryTree.TreeFactory;
import tree.binaryTree.bfs_search.Bfs;

import java.util.List;

//二叉树的三种遍历
public class bianli {
    public static void preorder(BinaryTree tree) {
        if (tree == null) return;
        System.out.print(tree.value + " ");
        preorder(tree.leftNode);
        preorder(tree.rightNode);
    }

    public static void inorder(BinaryTree tree) {
        if (tree == null) return;
        inorder(tree.leftNode);
        System.out.print(tree.value + " ");
        inorder(tree.rightNode);
    }

    public static void postorder(BinaryTree tree) {
        if (tree == null) return;
        postorder(tree.leftNode);
        postorder(tree.rightNode);
        System.out.print(tree.value + " ");
    }

    public static void main(String[] args) {
        System.out.println("先序遍历：");
        preorder(TreeFactory.getBinaryTree());
        System.out.println();
        System.out.println("中序遍历：");
        inorder(TreeFactory.getBinaryTree());
        System.out.println();
        System.out.println("后序遍历：");
        postorder(TreeFactory.getBinaryTree());
        System.out.println();
        System.out.println("层级遍历：");
        Bfs bfs = new Bfs();
        List res = bfs.levelOrder(TreeFactory.getBinaryTree());
        System.out.println(res.toString());
    }
}
