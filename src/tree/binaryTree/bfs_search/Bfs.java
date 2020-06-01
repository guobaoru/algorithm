package tree.binaryTree.bfs_search;

import tree.binaryTree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {
    List<List<Integer>> res = new ArrayList();

    // 二叉树层级遍历
    public List<List<Integer>> levelOrder(BinaryTree root) {
        if (root == null) return res;                                //边界条件
        Queue<BinaryTree> q = new LinkedList();             //创建的队列用来存放结点，泛型注意是TreeNode
        q.add(root);
        while (!q.isEmpty()) {                        //队列为空说明已经遍历完所有元素，while语句用于循环每一个层次
            int count = q.size();
            List<Integer> list = new ArrayList();
            while (count > 0) {                             //遍历当前层次的每一个结点，每一层次的Count代表了当前层次的结点数目
                BinaryTree temp = q.peek();
                q.poll();                                        //遍历的每一个结点都需要将其弹出
                list.add(temp.value);
                if (temp.leftNode != null) q.add(temp.leftNode);      //迭代操作，向左探索
                if (temp.rightNode != null) q.add(temp.rightNode);
                count--;
            }
            res.add(list);
        }
        return res;
    }
}
