package Fun;

public class Node {
	private Object obj;
	private Node node;
	public Node(Object obj, Node nodes){
		this.obj = obj;
		node=nodes;
	}
	public void setNext(Node nodes){
		node = nodes;
	}
	public Node getNext(){
		return node;
	}
	public Object getData(){
		return obj;
	}
}
