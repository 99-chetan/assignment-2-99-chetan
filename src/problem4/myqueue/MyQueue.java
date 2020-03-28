/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
import problem1.node.TreeNode;
import problem4.node.Node;

public class MyQueue {
    Node front;
    Node rear;

    public MyQueue(){
        front = null;
        rear = null;
    }
    public void enqueue(int data){
        Node ns = new Node(data);
        if(front==null){
            front = ns;
            rear = ns;
        }
    }
}
