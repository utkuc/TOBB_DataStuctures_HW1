package project.utku;

public class SLList {
	private Node head;
	private Node tail;
	private int size;

	public SLList() {
		size = 0;
		head = null;
		tail = null;
	}
	public SLList(Node n){
		addFirst(n);
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	public void addFirst(Node yeni) {
		if (isEmpty()) {
			head = yeni;
			tail = yeni;
			yeni.setNext(null);
		} else if (size == 1) {
			yeni.setNext(head);
			tail = head;
			head = yeni;
			tail.setNext(null);
		} else {
			yeni.setNext(head);
			head = yeni;
		}

		size++;
	}

	public boolean removeFirst() {
		if (isEmpty()) {
			return false;
		} else {
			if (size == 1) {
				head = null;
				tail = null;
			} else {
				Node temp = head.getNext();
				head.setNext(null);
				head = temp;
			}
			size--;

		}
		return true;
	}

	public boolean removeLast() {
		if (isEmpty())
			return false;
		else {
			if (size() == 1) {
				removeFirst();
			} else {
				Node temp;
				for (temp = head; temp.getNext() != tail; temp = temp.getNext()) {
				}
				temp.setNext(null);
				tail = temp;
			}
		}
		size--;
		return true;

	}

	public void addLast(Node yeni) {
		if (size == 0) {
			addFirst(yeni);
		} else {
			tail.setNext(yeni);
			tail = yeni;
			tail.setNext(null);
			size++;
		}

	}

	public String toString() {
		String s = "";
		for (Node temp = head; temp != null; temp = temp.getNext()) {
			s = s + temp.toString();
		}
		return s;
	}

}
