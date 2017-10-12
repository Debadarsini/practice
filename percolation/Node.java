
public class Node<E> {

		private E item;
		private Node next;
		public E getItem() {
			return item;
		}
		public void setItem(E item) {
			this.item = item;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node(E item, Node next) {
			super();
			this.item = item;
			this.next = next;
		}
	
		
}
