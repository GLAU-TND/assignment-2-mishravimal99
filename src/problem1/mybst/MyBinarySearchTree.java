/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;
    private int countRight;
    public void insert(int data){
        TreeNode node=new TreeNode(data);
        if(root==null){
            root=node;
        }else{
            TreeNode current=root;
            TreeNode parent=null;
            while(current!=null){
                parent=current;
                if(node.getData()<current.getData()){
                    current=curent.getLeft();
                }else{
                    current=current.getRight();
                }
            }
            if(node.getData()<parent.getData()){
                parent.setLeft(node);
            }else{
                parent.setRight(node);
            }
        }
    }

}
