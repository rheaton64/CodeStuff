package summertech;

public class Node<T, K> {
	T key;
	K value;
	public Node (T key, K value){
		this.key = key;
		this.value = value;
	}
	
	public T getKey(){
		return key;
	}
	
	public K getValue(){
		return value;
	}
}
