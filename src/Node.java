public class Node<Integer> {
	private Integer data;
	private Node<Integer> next;

	public Node(Integer data, Node<Integer> next)
	{
		this.data = data;
	    this.next = next;
	 }

	public Node<Integer> getNext() {
		return next;
	}

	public void setNext(Node<Integer> next) {
		this.next = next;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	
}
