package chapter10;

//Ryan
//Arrays class for project 10.1

public class Arrays1 {
	//Counter variables
	private int eCount = 0;
	private int oCount = 0;
	private int nCount = 0;
	
	//Instance variables
	private int[] evenList;
	private int[] oddList;
	private int[] negativeList;
	//Constructor
	public Arrays1(){
		evenList = new int[10];
		oddList = new int [10];
		negativeList = new int[10];
	}
	//Method to set the arrays
	public void setArrays(int[] nums){
		for(int i = 0; i < nums.length; i++){
			if(nums[i] < 0){
				negativeList[nCount] = nums[i];
				nCount++;
			}
			else if(nums[i] % 2 == 0){
				evenList[eCount] = nums[i];
				eCount++;
			}
			else{
				oddList[oCount] = nums[i];
				oCount++;
			}
		}
	}
	//toString method to print arrays
	public String toString(){
		String even = "Even Numbers: ";
		String odd = "Odd Numbers: ";
		String neg = "Negative Numbers: ";
		for(int i = 0; i < eCount; i++){
			even += evenList[i] + ", ";
		}
		for(int i = 0; i < oCount; i++){
			odd += oddList[i] + ", ";
		}
		for(int i = 0; i < nCount; i++){
			neg += negativeList[i] + ", ";
		}
		even = even.substring(0, even.length()-2);
		odd = odd.substring(0, odd.length()-2);
		neg = neg.substring(0, neg.length()-2);
		return even+"\n"+odd+"\n"+neg;
	}
}
