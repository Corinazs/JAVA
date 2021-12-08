package Datenstrukturen;

public class DoublyLinkedList {
	
	private DoublyLinkedListNode head;
	private DoublyLinkedListNode tail;
	
	
	public DoublyLinkedList() {
		this.head= null;
		this.tail= null;
	}
	
	//Hinzufügen eines String-Eintrags am Ende der Liste
		public void enqueue(String text, DoublyLinkedListNode node) {
			if(this.tail == null) {
				this.head=node;
			}
			this.tail.setNext(node);
			this.tail = node;
			this.tail.setEntry(text);
			
			if(this.head==null) {
				this.head=node;
			}
		}
		
		//Entfernen des Knoten am Anfang
		public void dequeue(String text, DoublyLinkedListNode node) {
			if(this.head==null) {
				this.head = node;
			}
			
			this.head=this.head.getNext();
			
		}
		
	

}
