package Fun;

public class BinaryTree{
	private TreeNode head;

	public BinaryTree(TreeNode n){
		head = n;
	}
	//access.exImage(paint.getfile(untitled));
	public void add(int i){
		TreeNode temp = head;
		TreeNode n = new TreeNode(i, null, null);
		if(temp == null){
			head = n;
			return;
		}
		boolean test = true;
		while(test == true){
			if(n.getData() < temp.getData()){
				if(temp.getLeft() == null){
					temp.setLeft(n);
					test = false;
				}
				else{
					temp = temp.getLeft();
				}
			}
			if(n.getData() > temp.getData()){
				if(temp.getRight() == null){
					temp.setRight(n);
					test = false;
				}
				else{
					temp = temp.getRight();
				}
			}
		}
	}
	public int getSize(TreeNode temp){
		temp = head;
		if(temp == null){
			return 0;
		}
		else{
			return 1 + getSize(temp.getLeft()) + 1 + getSize(temp.getRight());
		}
	}
	public String toString(){
		return toString(head);
	}
	public String toString(TreeNode temp){
		String print = "";
		if(temp == null){
			return"";
		}

		else{
			return print + toString(temp.getLeft())  + ", " + temp.getData() + toString(temp.getRight());
		}
	}
	public String toString2(TreeNode temp){
		String print = "";
		if(temp == null){
			return"";
		}			
		else{
			return print + toString(temp.getRight())  + ", " + temp.getData() + toString(temp.getLeft());
		}
	}
	public String toString1(TreeNode temp){
		String print = "";
		if(temp == null){
			return"";
		}			
		else{
			return print + ", " + temp.getData() + toString(temp.getLeft()) + toString(temp.getRight());
		}
	}
	//I hate this method so much
	public void remove(int i, int n, TreeNode temp, TreeNode tmp){
		if(i < temp.getData()){
			if(temp.getLeft().getData() == i){
				//ugh what do i put here
				if(n == 0){
					tmp = temp.getLeft();
					remove(i, n+1, temp, tmp);
				}
				else if(tmp.getRight() != null && n == 1){
					System.out.println(n);
					remove(i, n+1, temp, tmp.getRight());
				}
				else if(tmp.getLeft() != null && n == 2){
					System.out.println(n);
					remove(i, n-1, temp, tmp.getLeft());
				}
				else if(tmp == temp.getLeft() && tmp.getLeft() == null && tmp.getRight() == null){
					temp.setLeft(null);
				}
				else if(n >= 3){
						System.out.println(n);
						if(temp.getLeft().getLeft() == tmp){
							tmp.setRight(temp.getLeft().getRight());
							temp.setLeft(tmp);
						}
						if(temp.getLeft().getRight() == tmp){
							tmp.setLeft(temp.getLeft().getLeft());
							temp.setLeft(tmp);
						}
						else{
						tmp.setLeft(temp.getLeft().getLeft());
						tmp.setRight(temp.getLeft().getRight());
						temp.setLeft(tmp);
						}
				}
				else{
					System.out.println(n);
					remove(i, n+1, temp, tmp);
				}
			}
			else{
				remove(i, n, temp.getLeft(), tmp);
			}

		}
		if(i > temp.getData()){
			if(temp.getRight().getData() == i){
				//same
				if(n == 0){
					tmp = temp.getRight();
					remove(i, n+1, temp, tmp);
				}
				else if(tmp.getLeft() != null && n == 1){
					System.out.println(n);
					remove(i, n+1, temp, tmp.getLeft());
				}
				else if(tmp.getRight() != null && n == 2){
					System.out.println(n);
					remove(i, n-1, temp, tmp.getRight());
				}
				else if(tmp == temp.getRight() && tmp.getLeft() == null && tmp.getRight() == null){
					temp.setRight(null);
				}
				else if(n >= 3){
					System.out.println(n);
					if(temp.getRight().getLeft() == tmp){
						tmp.setRight(temp.getRight().getRight());
						temp.setRight(tmp);
					}
					if(temp.getRight().getRight() == tmp){
						tmp.setLeft(temp.getRight().getLeft());
						temp.setRight(tmp);
					}
					else{
					tmp.setLeft(temp.getRight().getLeft());
					tmp.setRight(temp.getRight().getRight());
					temp.setRight(tmp);
					}
				}
				else{
					remove(i, n, temp.getRight(), tmp);
				}
			}
		}
		if(temp.getData() == i){
			System.out.println("oops");
		}
	}
	public void removeHead(TreeNode temp){
		TreeNode n = head;
		temp = temp.getRight();
		temp.setLeft(n.getLeft());
	}
	public void remove2(int i){
		TreeNode temp = head;
		TreeNode tmp = head;
		boolean test = false;
		while(temp.getData() != i){
			temp = tmp;
			if(temp.getData() > i){
				tmp = tmp.getLeft();
			}
			if(temp.getData() < i){
				tmp = tmp.getRight();
			}
			if(temp == null){
				return;
			}
		}
		
	}
}