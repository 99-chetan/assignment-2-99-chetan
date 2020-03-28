/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;
import problem3.node.Node;

public class MyPriorityQueue {
    private Node front;
    private Node rear;
    private int size;

    public MyPriorityQueue(){
        front=null;
        rear=null;
        size=0;
    }
    public boolean isEmpty(){
        boolean response=false;
        if(front!=null || size!=0){
            response=true;
        }
        return response;
    }
    public Node dequeue(){
        Node response=null;
        if(isEmpty()){
            if(front.getNext()!=null){
                response=new Node(front.getData());
                front=front.getNext();
                rear.setNext(front);
                size--;
            }
            else {
                response=new Node(front.getData());
                front=null;
                rear=null;
                size--;
            }
        }
        return response;
    }

    public void  enqueue(int data){
        Node node=new Node(data);
        if(front==null){
            front=node;
            rear=node;
            size++;
            System.out.println("Value Entered successfully...");
        }
        else if(data<=front.getData()){
            node.setNext(front);
            front=node;
            size++;
            System.out.println("Value Entered successfully...");
        }
    }
}
