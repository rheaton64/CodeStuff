package arrayProj;

//Ryan
//Arrays class for Array Project 1

import java.util.Arrays;

public class Arrays1 {
	private int[] numList;
	//Constructor
	public Arrays1(){
		numList = new int[10];
	}
	//Method to set the array
	public void setArray(int[] nums){
		for(int i = 0; i < nums.length; i++){
			numList[i] = nums[i];
		}
	}
	public int[] sort(int ar[]){
		for (int i = (ar.length - 1); i >= 0; i--){
			for (int j = 1; j <= i; j++){
				if (ar[j-1] > ar[j]){
					int temp = ar[j-1];
					ar[j-1] = ar[j];
					ar[j] = temp;
				}
			} 
		}
		return ar;
	}

	//toString method that sorts and return a string of the array
	public String toString(){
		String str = "Sorted numbers: ";
		numList = sort(numList);
		for(int i = 0; i < numList.length; i++){
			str += numList[i]+", ";
		}
		str = str.substring(0, str.length()-2);
		return str;
	}
}
