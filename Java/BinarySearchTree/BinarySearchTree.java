package tree;

public class BinarySearchTree {

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int data) {
		if (root == null)
			root = new Node(data);
		else {
			_insert(root, data);
		}
	}

	private void _insert(Node currentNode, int data) {
		if (currentNode.data > data) {
			if (currentNode.left == null) {
				currentNode.left = new Node(data);
			} else {
				_insert(currentNode.left, data);
			}
		} else {
				if (currentNode.right == null) {
					currentNode.right = new Node(data);
				} else {
					_insert(currentNode.right, data);
				}
		}
	}

	public void show() {
		if (root != null) {
			_show(root);
		} else
			return;
	}

	private void _show(Node currentNode) {
		if (currentNode != null) {
			_show(currentNode.left);
			System.out.print(currentNode.data + " "); // LDR
			_show(currentNode.right);
		}

	}

	public int search(int searchNumber) {
		if (root != null) {
			return _search(root, searchNumber);
		} else
			return -1;
	}

	private int _search(Node currentNode, int searchNumber) {
		if (currentNode.data == searchNumber)
			return 1;

		else if (currentNode.data > searchNumber && currentNode.left != null)
			return _search(currentNode.left, searchNumber);

		else if (currentNode.data < searchNumber && currentNode.right != null)
			return _search(currentNode.right, searchNumber);
		return -1;
	}
}
