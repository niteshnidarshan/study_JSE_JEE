package core.ds.linkedlist;

public class LinkedListImpl {
	
	public static void main(String []args) {
		LinkedList list = new LinkedList();

		list.add(10);

		list.add(20); 
		
		list.add(30);
		
		System.out.println(list.size());
		list.show();
	}

}
