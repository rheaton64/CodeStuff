package arrayProj;

//Ryan
//Arrays class for Array Project 2

public class Arrays2 {
	//Instace variable
	private int[] numList;
	//Constructor
	public Arrays2(int[] numList){
		this.numList = numList;
	}
	//Method to find the mode(s) of the array
	public int[] getMode(){
		int[] output = new int[11];
		ArrayNum[] numbers = new ArrayNum[10];
		int count = 0;
		int high = 0;
		boolean check = false;
		for(int i = 0; i < numList.length; i++){
			for(int x = 0; x < numbers.length; x++){
				if(numbers[x] != null){
					if(numbers[x].getNum() == numList[i]){
						numbers[x].addCount();
						check = true;
						break;
					}
				}
			}
			if(check == false){
				numbers[count] = new ArrayNum(numList[i]);
				count++;
			}
			check = false;
		}
		for(int i = 0; i < count; i++){
			if(numbers[i].getCount() > high){
				high = numbers[i].getCount();
			}
		}
		int counter = 1;
		for(int i = 0; i < count; i++){
			if(numbers[i].getCount() == high){
				output[counter] = numbers[i].getNum();
				counter++;
			}
		}
		output[0] = counter-1;
		return output;
	}
	//toString method to return the modes
	public String toString(){
		String str = "";
		int[] mode = getMode();
		if(mode[0] > 1){
			str = "Modes: ";
			for(int i = mode[0]; i > 0; i--){
				str += mode[i] + ", ";
			}
			str = str.substring(0, str.length()-2);
		}
		else{
			str = "Mode: "+mode[1];
		}
		return str;
	}
}
