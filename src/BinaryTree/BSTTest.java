package BinaryTree;

public class BSTTest {
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(10);
		bst.insert(25);
		bst.insert(35);
		bst.inOrder(bst.root);
		
		
		 
		System.out.println();
		bst.delete(20);
		bst.inOrder(bst.root);
		
	}
}
