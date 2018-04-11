package arrayProj;

public class ArrayNum {
	//Instance variables
	private int num;
	private int count;
	//Contructor
	public ArrayNum(int num){
		this.num = num;
		count = 0;
	}
	//Method to add to the count
	public void addCount(){
		count++;
	}
	//Getters
	public int getNum(){
		return num;
	}
	public int getCount(){
		return count;
	}
}
