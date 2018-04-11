package arrayProj;

//Ryan
//Arrays class for Array Project 3

public class Arrays3 {
	//Instance variable
	int[] numList;
	
	//Constructor
	public Arrays3(int[] numList){
		this.numList = numList;
	}
	
	//Get reversed list
	public int[] getReverse(){
		int[] temp = new int[numList.length];
		int count = numList.length-1;
		for(int i = 0; i <= numList.length-1; i++){
			temp[i] = numList[count];
			count--;
		}
		return temp;
	}
	//toString method the outputs the reversed array
	public String toString(){
		int[] nums = getReverse();
		String str = "Reversed numbers: ";
		for(int i = 0; i < numList.length; i++){
			str += nums[i]+", ";
		}
		str = str.substring(0, str.length()-2);
		return str;
	}
}
