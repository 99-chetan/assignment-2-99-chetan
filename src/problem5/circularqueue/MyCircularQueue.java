/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
import problem5.node.Node;
import problem5.student.Student;

public class MyCircularQueue {
    Node front;
    Node rear;
    int size;

    public MyCircularQueue(){
        front=null;
        rear=null;
        size=0;
    }
}
