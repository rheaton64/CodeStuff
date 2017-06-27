package Fun;

public class TreeNode {
	private int i;
	private TreeNode lNode;
	private TreeNode rNode;
	public TreeNode(int i, TreeNode nodes, TreeNode nodess){
			this.i = i;
			lNode = nodes;
			rNode = nodess;
		}
		public void setLeft(TreeNode n){
			lNode = n;
		}
		public void setRight(TreeNode n){
			rNode = n;
		}
		public int getData(){
			return i;
		}
		public TreeNode getLeft(){
			return lNode;
		}
		public TreeNode getRight(){
			return rNode;
		}
	}
	

