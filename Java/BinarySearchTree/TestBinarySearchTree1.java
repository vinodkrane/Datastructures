package tree;

public class TestBinarySearchTree1 {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(11);
		bst.insert(22);
		bst.insert(8);
		bst.insert(4);
		bst.insert(33);
		bst.insert(18);
		bst.show();
		System.out.println(bst.search(14));
	}
}
