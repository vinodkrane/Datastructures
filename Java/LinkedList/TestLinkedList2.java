package linkedList;

public class TestLinkedList2 {

	public static void main(String[] args) {
		LinkedListDemo list = new LinkedListDemo();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(33);
		list.add(22);
		list.add(11);
		list.show();
/*		list.printMiddleNode();
		list.printAlternate();
		list.printReverseInOrder(list.head);
		list.printReverseAlternateInOrder(list.head,true);  */
		list.isPalindrome();
		
	}

}
