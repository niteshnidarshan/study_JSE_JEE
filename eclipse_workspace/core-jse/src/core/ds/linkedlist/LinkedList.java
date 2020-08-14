package core.ds.linkedlist;

public class LinkedList {
	
	private Node head;
	private int size = 0;
	
	public int size() {
		return size;
	}
	
	public void add(Object item) {
		if(head == null) {
			
			//If head is null create a node
			Node node = new Node();
			node.item = item;
			node.next = null;
			
			head = node;
			
			//set LinkedList size
			size ++;
			
		}else {
			
			//traverse node till null and set new node at last
			Node currentNode = head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			
			Node node = new Node();
			node.item = item;
			node.next = null;
			currentNode.next = node;
			
			size ++;
			
		}
	}
	
	public void show() {
		//traverse node till null and print node item
		Node currentNode = head;
		int showCount = 0;
		while(showCount < size) {
			
			if(currentNode != null) {
				System.out.print(currentNode.item);
				System.out.print(" ");
				currentNode = currentNode.next;
			}
			
			showCount++;
			
		}
	}
	

}
