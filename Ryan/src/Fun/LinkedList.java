package Fun;

import java.util.ArrayList;

public class LinkedList {
	private Node head;

	public LinkedList(Node n){
		head = n;
	}
	public void addNode(Node n){
		Node temp = head;
		if(temp == null){
			head = n;
		}
		while(temp.getNext() != null){
			temp = temp.getNext();
		}
		temp.setNext(n);
	}
	public void addObj(Object o){
		Node temp = head;
		Node n = new Node(o, null);
		if(temp == null){
			head = n;
		}
		while(temp.getNext() != null){
			temp = temp.getNext();
		}
		temp.setNext(n);
	}
	public Object get(Object o){
		Node temp = head;
		Object obj;////
		if(temp == null){
			return null;
		}
		boolean test = true;
		while(test == true){
			test = false;
			if(temp != null  && temp.getData().equals(o)){
				obj = temp.getData();
				return obj;
			}
			else{
				test = true;
				temp = temp.getNext();
			}
		}
		return null;
	}
	public int size(){
		Node temp = head;
		if(temp == null){
			return 0;
		}
		boolean test = true;
		int size = 0;
		while(test == true){
			test = false;
			if(temp.getNext() == null){
				return size;
			}
			else{
				size++;
				temp = temp.getNext();
				test = true;
			}
		}
		return size;
	}
	public void addPos(int i, Object o){
		Node temp = head;
		i--;
		Node n = new Node(o, null);
		boolean test = true;
		while(test == true){
			if(i == 0){
				n.setNext(temp.getNext());
				temp.setNext(n);
				test = false;
			}
			else{
				temp = temp.getNext();
				i--;
			}
		}
	}
	public void delPos(int i){
		Node temp = head;
		i--;
		if(i == 0){
			head = temp.getNext();
		}
		boolean test = true;
		while(test == true){
			if(i <= 0){
				temp.setNext(temp.getNext().getNext());
				test = false;
			}
			else{
				temp = temp.getNext();
				i--;
			}
		}
	}
	public String toString(){
		Node temp = head;
		String print = "";
		boolean test = true;
		while(test == true){
			if(temp == head){
				print = print + temp.getData();
				temp = temp.getNext();
			}
			else if(temp != null){
				print = print + ", " + temp.getData();
				temp = temp.getNext();
			}
			else{
				test = false;
				return print;
			}
		}
		return print;
	}
	public Object[] toArray(){
		Node temp = head;
		int size = size()-1;
		Object[] a = new Object[size];
		int sTrack = 0;
		boolean test = true;
		while(test == true){
			if(temp != null){
				a[sTrack] = temp.getData();
				sTrack++;
				temp = temp.getNext();
			}
			else{
				test = false;
				return a;
			}
		}
		return a;
	}
	public ArrayList<Object> toArrayList(){
		ArrayList<Object> a = new ArrayList<Object>();
		Node temp = head;
		boolean test = true;
		while(test == true){
			if(temp != null){
				a.add(temp.getData());
				temp = temp.getNext();
			}
			else{
				test = false;
				return a;
			}
		}
		return a;
	}
	public Object getIndex(int i){
		Node temp = head;
		Object obj = null;
		i--;
		boolean test = true;
		while(test == true){
			if(i == 0){
				obj = temp.getData();
				test = false;
				return obj;
			}
			else{
				temp = temp.getNext();
				i--;
			}
		}
		return obj;
	}
}
