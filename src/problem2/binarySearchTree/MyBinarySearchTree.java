package problem2.main.binarySearchTree;

import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;
    private int countRight;
    private MyQueue preQueue;
    private MyQueue postQueue;

    public MyBinarySearchTree(MyQueue preQueue,MyQueue postQueue){
        this.preQueue=preQueue;
        this.postQueue=postQueue;
    }

    public void insert(int data){
        TreeNode node = new TreeNode(data);
        if(root==null){
            root=node;
        }
        else{
            TreeNode current=root;
            TreeNode parent = null;
            while(current!=null){
                parent=current;
                if(node.getData()<current.getData()){
                    current=current.getLeft();
                }
                else{
                    current=current.getRight();
                }
            }
            if(node.getData()<parent.getData()){
                parent.setLeft(node);
            }
            else{
                parent.setRight(node);
            }
        }
    }

    public MyQueue getPreQueue() {
        return preQueue;
    }

    public void setPreQueue(MyQueue preQueue) {
        this.preQueue = preQueue;
    }

    public MyQueue getPostQueue() {
        return postQueue;
    }

    public void setPostQueue(MyQueue postQueue) {
        this.postQueue = postQueue;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void preOrder(TreeNode temp){
        if(temp==null){
            return;
        }
        else{
            preQueue.enqueue(temp.getData());
            preOrder(temp.getLeft());
            preOrder(temp.getRight());
        }
    }

    public void postOrder(TreeNode temp){
        if(temp==null){
            return;
        }
        else{
            postOrder(temp.getLeft());
            postOrder(temp.getRight());
            postQueue.enqueue(temp.getData());
        }
    }

    public void inOrder(TreeNode temp){
        if(temp==null){
            return;
        }
        else{

            inOrder(temp.getLeft());
            System.out.println(temp.getData());
            inOrder(temp.getRight());
        }
    }

    public int getCountRight() {
        return countRight;
    }

    public void setCountRight(int countRight) {
        this.countRight = countRight;
    }

    public void traverse(){
        TreeNode current = root;
        TreeNode parent = null;
        this.countRight=0;
        while(current!=null){
            if(current.getLeft()==null) {
                countRight++;
            }
            if(parent.getData()==current.getData()){

            }
            if(parent.getData()<current.getData()) {
                System.out.println(current.getData());
                current = current.getLeft();
            }
            if(parent.getData()>current.getData()){
                current = current.getRight();
            }
        }
    }
}