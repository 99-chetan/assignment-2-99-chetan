/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
    public int getData()
    {
        return data;
    }
}
