/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem4.linkedList.MyLinkedList;
import problem4.linkedList.Node;

public class MyQueue {
    MyLinkedList linkedList = new MyLinkedList();
    public int peek(int data){
        if(linkedList.search(data)==null){
            return -1;
        }
        return linkedList.search(data).getData();
    }

    public void enqueue(int data){
        linkedList.addLast(data);
    }

    public void dequeue(){
        linkedList.deleteFirst();
    }

    public void show(){
        linkedList.display();
    }
}
