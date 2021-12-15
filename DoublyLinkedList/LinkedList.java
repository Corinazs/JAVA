public class LinkedList {
	private ListNode head;

	public LinkedList() {
		this.head = null;
	}

	public void add(int value) {
		//neuen Listenknoten erzeugen, zeige auf nächsten Knoten
		ListNode newNode = new ListNode(value, this.head);
		this.head = newNode;
	}

	public int size() {
		ListNode current = this.head;
		int count = 0;
		while (current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}

	public boolean contains(int value) {
		ListNode current = this.head;
		while (current != null) {
			if (current.getEntry() == value) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	public double sumIt() {
		double summe=0;
		ListNode current = this.head;
		while(current!=null) {
			summe = summe + current.getEntry();
			current.getNext();
		}
		return summe;
	}

	public int sum() {
		return sum(this.head);
	}

	private int sum(ListNode node) {
		if(node == null) {
			return 0;
		}
		return sum(node.getNext())+node.getEntry();
	}

	public void printList() {
		printList(this.head);
	}
	private void printList(ListNode node) {
		if (node == null) {
			System.out.println("ff :");
			return;
		}

		printList(node.getNext());
		node.print();

	}

	public void printReverseList() {		
		printReverseList (this.head);
	}
	private void printReverseList(ListNode node) {
		if(node==null) {
			System.out.println("gg :");
			return;
		}
		node.print();
		printReverseList(node.getNext());
	}

	public void remove(int value) {		
		this.head = remove(this.head,value);
	}
	private ListNode remove(ListNode node, int value) {

		if(node.getEntry()==value) {

			return node.getNext(); //übergibt nächsten Knoten an Zeile 94
		}

		node.setNext(remove(node.getNext(),value));
		//remove(node.getNext(), value);
		return node;
	}

	public boolean contains2(int value) {
		return contains2(this.head,value);
	}

	private boolean contains2(ListNode node, int value) {
		if(node==null) {
			return false;
		}
		if(node.getEntry()!= value) {
			contains2(node.getNext(), value);
		}
		return true;
	}

	public void add2(int index, int value) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("index muss im "
					+ "Bereich von 0 bis " + size() + " liegen.");
		}
		this.head = add2(this.head, index, value);
	}
	private ListNode add2(ListNode node,
			int steps, int value) { // 1
		if (steps == 0) { // 2
			return new ListNode(value, node); // 3
		} // 4
		node.setNext(add2(node.getNext(), steps - 1, value)); // Verkettung des Vorgängerknotens mit dem neuen Knoten
		return node; // 6
	}

	public int get(int index) {
		if(index<0 || index> size()) {
			throw new IllegalArgumentException("Index nicht zulässig.");
		}

		while (this.head != null){
			this.head.getNext();

			if(this.head.equals(index)) {
				return this.head.getEntry();
			}
		}
		//index nicht vorhanden
		return -1;
	}

	public int get2(int index) {
		return get2(this.head, index);
	}

	private int get2(ListNode node, int index) {
		if(node== null) {
			throw new IllegalArgumentException("Eintrag nicht vorhanden.");
		}
		if(index<0 || index> size()) {
			throw new IllegalArgumentException("Index nicht zulässig.");
		}
		if(node.equals(index)) {
			return node.getEntry();
		}
		return get2(node.getNext(), index);
	}


	public void clear() {
		this.head = null;
	}
	public boolean isEmpty() {
		if(this.head == null) {
			return true;
		}
		return false;
	}

	public LinkedList subList(int fromIndex, int toIndex) {
		LinkedList neu = new LinkedList();
		for(int i=get2(this.head, fromIndex); i<get2(this.head,toIndex);i++) {
			neu.add(get2(this.head,i));
		}
		return neu;
	}
	

}
