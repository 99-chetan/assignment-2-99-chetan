/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MyPriorityQueue obj=new MyPriorityQueue();
        System.out.print("For Insertion press 1, for Dequeue press 2, for traversing press3, to print number of elements press 4: ");
        int counter = sc.nextInt();
        while(counter!=0){
            switch(counter){
                case 1:
                    System.out.print("Enter number you want to enter: ");
                    obj.enqueue(sc.nextInt());
                    break;
                case 2:
                    Node result=obj.dequeue();
                    if(result!=null) {
                        System.out.println("The number is: " + result.getData() + ". Your number is also deleted from Queue");
                    }
                    else{
                        System.out.println("The Queue is empty");
                    }
                    break;
            }
        }
    }
}
