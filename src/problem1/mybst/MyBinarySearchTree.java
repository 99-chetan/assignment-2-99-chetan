/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
import problem1.node.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
public class MyBinarySearchTree {
    private TreeNode root;
    private int size;

    public TreeNode getRoot()
    {
        return root;
    }
    public void insert(int data) {
        TreeNode node=new TreeNode(data);
        if(root==null) {
            root = node;
            size++;
            System.out.println("Inserted successfully at root");
        }
        else{
            TreeNode temp=root;
            TreeNode parent=null;
            while(temp!=null){
                parent=temp;
                if(node.getData()<=temp.getData())
                {
                    temp=temp.getLeft();
                }
                else
                {
                    temp=temp.getRight();
                }
            }
            if(node.getData()<=parent.getData())
            {
                parent.setLeft(node);
                size++;
                System.out.println("Insertion successful at left");
            }
            else
            {
                parent.setRight(node);
                size++;
                System.out.println("Insertion successful at right");
            }
        }
    }
    public void traverseLevelOrder(TreeNode node) {
        if (node == null) {
        }
        else {
            int count = 0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(node);
            System.out.print("Left Node data: ");
            while (!(queue.isEmpty())) {
                TreeNode currentNode = queue.remove();
                if (currentNode.getLeft() == null) {
                    count++;
                } else if (currentNode.getLeft() != null) {
                    System.out.print(currentNode.getLeft().getData() + " ");
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }
            System.out.println();
            System.out.println("Number of nodes which don't have left node: " + count);
        }
    }
}
