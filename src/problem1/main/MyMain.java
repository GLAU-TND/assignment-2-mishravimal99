/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class
import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {

        MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
        binarySearchTree.insert(500);
        binarySearchTree.insert(400);
        binarySearchTree.insert(300);
        binarySearchTree.insert(200);
        binarySearchTree.insert(100);

        System.out.println("Left childs of the binary search tree: ");
        binarySearchTree.traverse();
        System.out.println("No.of Parents not having  left childs are:");
        System.out.println(binarySearchTree.getCountRight());
    }
}
