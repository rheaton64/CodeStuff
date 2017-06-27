package Fun;

public class LinkTest {

	public static void main(String[] args) {
		/*Node n = new Node("start", null);
		LinkedList list = new LinkedList(n);
		list.addObj(2);
		list.addObj(3);
		list.addObj(4);
		list.addPos(4, "bye");
		list.delPos(1);
		System.out.println(list);
		System.out.println(list.getIndex(1));*/
		int head = 5;
		TreeNode n =  new TreeNode(head, null, null);
		TreeNode n2 = new TreeNode (head, null, null);
		BinaryTree tree = new BinaryTree(n);
		tree.add(1);
		tree.add(12);
		tree.add(2);
		tree.add(-3);
		//tree.remove(2, 0, n, n2);
		tree.removeHead(n);
		System.out.println(tree);

	}

}
