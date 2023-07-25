package sanjanaab;
import java.util.*;
class Node{
	int data;
	Node left,right;
	public Node(int item) {
		data=item;
		left=right=null;
	}
		
};
public class Tree {
    Node root;
    int level(Node node) {
    	if(node==null) {
    		return 0;
    	}
    	return node.data-level(node.left)-level(node.right);
    }
	public static void main(String[] args) {
		Tree tree=new Tree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		int x=tree.level(tree.root);
		System.out.println("the difference between the sum of odd and even level of the binary tree:"+x);
	}

}
