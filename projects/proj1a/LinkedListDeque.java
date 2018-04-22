public class LinkedListDeque<T> {
	private IntNode sentinel;
	private int size;

	private class IntNode {
		public IntNode prev;
		public T item;
		public IntNode next;
		public IntNode() {}
		public IntNode(IntNode p, T i, IntNode n) {
			prev = p;
			item = i;
			next = n;
		}
	}

	public LinkedListDeque() {
		sentinel = new IntNode();
		sentinel.prev = sentinel;
		sentinel.next = sentinel;
	}

	private T helper(IntNode p, int index) {
		if (index == 0) {
			return p.item;
		}
		return helper(p.next, index - 1);
	}

	public T getRecursive(int index) {
		if (index >= size){
			return null;
		}
		return helper(sentinel, index);
	}

	public void addFirst(T item) {
		size += 1;
		sentinel.next = new IntNode(sentinel, item, sentinel.next);
		sentinel.next.next.prev = sentinel.next;
	}

	public void addLast(T item) {
		size += 1;
		sentinel.prev = new IntNode(sentinel.prev, item, sentinel);
		sentinel.prev.prev.next = sentinel.prev;

	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}

	public void printDeque() {
		if (size == 0) {
			return;
		}
		IntNode ptr = sentinel;
		for (int i = 0; i < size; i++) {
			System.out.println(ptr.item + " ");
			ptr = ptr.next;
		}
	}

	public T removeFirst() {
		if (size == 0) {
			return null;
		}
		size -= 1;
		IntNode re = sentinel.next;
		sentinel.next = re.next;
		re.next.prev = sentinel;
		return re.item;
	}

	public T removeLast() {
		if (size == 0) {
			return null;
		}
		size -= 1;
		IntNode re = sentinel.prev;
		sentinel.prev = re.prev;
		re.prev.next = sentinel;
		return re.item;
	}

	public T get(int index) {
		if (index >= size) {
			return null;
		}
		IntNode ptr;
		if (index < size/2) {//forward
			ptr = sentinel.next;
			for (int i = 0; i < index; i++) {
				ptr = ptr.next;
			}
			return ptr.item;
		}
		ptr = sentinel.prev;
		for (int i = size - 1; i > index; i--) {
			ptr = ptr.prev;
		}
		return ptr.item;
	}


}