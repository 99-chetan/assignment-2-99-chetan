/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class
import problem1.mybst.MyBinarySearchTree;
import java.util.Scanner;
public class MyMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyBinarySearchTree bst = new MyBinarySearchTree();
        System.out.print("For Insertion press 1, for printing left nodes and nodes which who doesn't have left child press 2: ");
        int counter = sc.nextInt();
    }
}
