public class Arloji2<E>{

	private Node<E> head;
	
	private Node<E> tail;
	
	public Arloji2(){
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void tambahDepan(E data){
		Node<E> Nodebaru = new Node<E>(data);
		
		if(isEmpty()){
		head = tail = Nodebaru;
		}else{
		Nodebaru.next = head;
		head = Nodebaru;
		}
	}
	
	public void tambahTengah(E data, E find){
		Node<E> Nodebaru = new Node<E>(data);
		
		if(isEmpty()){
			head = tail = Nodebaru;
		}else{
			Node<E> iterator = head;
			while(iterator.getData().equals(find)){
				iterator = iterator.next;
			}
			Nodebaru.next = iterator.next;
			iterator.next = Nodebaru;
		}
	}
	
	public void tambahBelakang(E data){
		Node<E> Nodebaru = new Node<E>(data);
		
			if(isEmpty()){
				head = tail = Nodebaru;
			}else{
		tail.next = Nodebaru;
		tail = Nodebaru;
		}
	}
	
	public void tambahBelakangNull(E data){
		Node<E> Nodebaru = new Node<E>(data);
			temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = Nodebaru;
	}
	
	public void hapusDepan(){
		if(isEmpty()){
				System.out.println("Empty");
		}else{
			if(head == tail){
				head = tail = null;
			}else{
				Node<E> sementara = head;
				head = head.next;
				sementara.next = null;
			}
		}
	}
		
	public void hapusBelakang(){
		if(isEmpty()){
			System.out.println("Empty");
		}if(head == tail){
			head = tail = null;
		}else{
			Node<E> iterator = head;
			while(iterator.next!=tail){
				iterator = iterator.next;
			}
			iterator = tail;
			tail.next = null;
		}	
	}
	
	public void Traverse(){
		Node<E> iterator = head;
		while(iterator.next != null){
			System.out.println(iterator.getData());
			iterator = iterator.next;
		}
	}
	
	public void BelakangDobel(){
		nodeBaru.next = null;
		while(head.next != null)
			head = head.next;
		head.next = nodeBaru;
		nodeBaru.prev = head;
	}
}
	
class Node<E>{
	E data;
	Node<E> next;
	
	public Node(E data){
		this.data = data;
		this.next = null;
	}
	
	public E getData(){
		return data;
	}
}


if(head != null)
			head.prev=nodeBaru;
			head = nodeBaru;