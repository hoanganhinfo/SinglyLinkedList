public class MainApp {
	public static void main(String args[]){
		SinglyLinkedList list = new SinglyLinkedList();
		list.append(1);
		list.append(5);
		list.append(45);
		list.append(12);
		list.append(7);
		list.append(3);
		list.append(10);
		list.append(3);
		list.print();
		list.removeEnd();
		list.print();
		list.deleteByGreaterThan(7);
		list.print();
		
	}
}
