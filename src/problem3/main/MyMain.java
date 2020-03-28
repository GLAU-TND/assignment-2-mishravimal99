/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("Tushar",58));
        queue.enqueue(new Student("Tanishq",23));
        queue.enqueue(new Student("Pavit",65));
        queue.enqueue(new Student("Samar",1));
        queue.enqueue(new Student("Vibhu",10));
        queue.enqueue(new Student("Shantanu",76));

        queue.show();
        queue.dequeue();
        queue.show();

    }
}