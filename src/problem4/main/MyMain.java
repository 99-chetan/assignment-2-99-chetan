/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

public class MyMain {
    public static void main(String[] args){
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(11);
        obj.insert(13);
        obj.insert(0);
        obj.insert(3);
        obj.insert(10);
        obj.insert(5);
        obj.insert(1);
        MyQueue mq = new MyQueue();
        mq.preSuccessor(obj.getRoot());
        mq.getPre();
    }
}
