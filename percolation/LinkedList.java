
public class LinkedList<E> {
	
	Node<E> head;
	
	Node<E> tail;
	
	public LinkedList(Node<E> head) {
		super();
		this.head = tail = head;
	}

	public LinkedList() {
		// TODO Auto-generated constructor stub
	}

	public void add( E data){
		
	    if(head==null){
	        Node<E> new_node = new Node<E>(data,head);
	        
	        tail= head = new_node;
	    }else{
	        head.setNext()
	    }
		
	}
	
	public void delete(E data){
		Node temp = head;
		Node prev = null;
		while(temp !=null && temp.getItem()!=data){
			prev = temp;
			temp = temp.getNext();
		}
		
		if(temp == null) return;
		
		prev.setNext(temp.getNext());
		
	}
	
	
	public void printList(Node node){
		while(node != null){
			System.out.println(node.getItem());
			node = node.getNext();
		}
		
	}
	
	public void reverseList(LinkedList ll){
		
		Node current = ll.head;
		Node next = null;
		Node prev = null;
		
		/*while(null != current ){
			prev = current.getNext();
			current.setNext(next);
			next=current;
			current=prev;
		}
		printList(next);*/
			
		Node reveresd = reverseList(prev,current,next);
		printList(reveresd);
	}
	
	
	private Node reverseList(Node prev, Node current, Node next) {
		if(null != current ){
			prev = current.getNext();
			current.setNext(next);
			next=current;
			current=prev;
			next=reverseList(prev,current,next);
		}
		return next;
	}

	public static void main(String [] args){
		Node node = new Node(5,null);
		LinkedList ll = new LinkedList(node);
		ll.add(4);
		ll.add(3);
		ll.add(2);
		ll.add(1);
		
		ll.printList(ll.head);;
		ll.reverseList(ll);
	}

}
