/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem2.main.binarySearchTree.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyQueue preQueue = new MyQueue();
        MyQueue postQueue= new MyQueue();
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree(preQueue,postQueue);
        myBinarySearchTree.insert(15);
        myBinarySearchTree.insert(25);
        myBinarySearchTree.insert(35);
        myBinarySearchTree.insert(45);
        myBinarySearchTree.insert(55);
        myBinarySearchTree.postOrder(myBinarySearchTree.getRoot());
        myBinarySearchTree.preOrder(myBinarySearchTree.getRoot());
        System.out.println("PreOrder:");
        preQueue.show();
        System.out.println("PostOrder:");
        postQueue.show();
        System.out.println();
    }
}