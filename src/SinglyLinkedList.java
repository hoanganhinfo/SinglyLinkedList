
public class SinglyLinkedList {
	private Node head;
	public SinglyLinkedList(){
		
	}
	public void append(int value){
		if (head == null){
			head = new Node(value,null);
		}else{
			Node<Integer> curNode = head;
		    while(curNode.getNext() != null){
		    	curNode = curNode.getNext();
		    }

		    curNode.setNext(new Node(value, null));
		}
	}
	public void removeEnd(){
		if (head != null){
			Node<Integer> curNode = head;
			Node<Integer> prevNode = head;
		    while(curNode.getNext() != null){
		    	prevNode = curNode;
		    	curNode = curNode.getNext();
		    }
		    prevNode.setNext(null);
		}
		
	}
	public void deleteByGreaterThan(int num){
		if (head != null){
			Node<Integer> curNode = head;
			Node<Integer> prevNode = head;
			Node<Integer> nextNode;
		    while(curNode.getNext() != null){
		    	if (curNode.getData() >= num){
		    		prevNode.setNext(curNode.getNext());
		    		curNode = curNode.getNext();
		    		
		    	}else{
		    		prevNode = curNode;
			    	curNode = curNode.getNext();	
		    	}
		    }
		    if (curNode.getData() >= num){
		    	prevNode.setNext(null);
		    }
		}
	}
	public void print(){
		if (head != null){
			Node<Integer> curNode = head;
		    while(curNode.getNext() != null){
		    	System.out.println(curNode.getData());
		    	curNode = curNode.getNext();
		    }
		    System.out.println(curNode.getData());
		}
		System.out.println("============================");
	}
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
}
