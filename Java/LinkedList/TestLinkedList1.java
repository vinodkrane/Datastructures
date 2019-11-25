package linkedList;

public class TestLinkedList1 {

	public static void main(String[] args) {
		LinkedListDemo list = new LinkedListDemo();
		list.add(11);
		list.add(22);
		list.add(33);
		list.addAt(1, 99);
		list.add(44);
		list.add(55);
		list.addAtStart(00);
		list.show();
		list.delete(2);
		list.show();
		list.size();
		list.reverse();
		list.show();
	}

}
