package chapter6;

//Ryan
//Lottery number object for lottery programming project

public class LottoNum {
	//Instance variables
	private int[] nums = new int[3];
	private boolean[] isChecked = new boolean[3];
	private int cost;
	private boolean isRand;
	//Default constructor
	public LottoNum(){
		this.nums = nums;
		this.cost = 2;
		this.isRand = false;;
	}
	//Constructor with parameters
	public LottoNum(int num0, int num1, int num2, boolean isRand){
		nums[0] = num0;
		nums[1] = num1;
		nums[2] = num2;
		cost = 2;
		this.isRand = isRand;
	}
	//Setters
	public void setNum(int num, int index){
		nums[index] = num;
	}
	public void setIsChecked(boolean isChecked, int index){
		this.isChecked[index] = isChecked;
	}
	public void setCost(int cost){
		this.cost = cost;
	}
	//Getters
	public int getNum(int index){
		return nums[index];
	}
	public boolean getIsChecked(int index){
		return isChecked[index];
	}
	public int getFullNum(){
		return (nums[0]*100)+(nums[1]*10)+(nums[2]);
	}
	public int getCost(){
		return cost;
	}
	//toString
	public String toString(){
		if(isRand == false){
			if(nums[0] == 0){
				return "Your number is: 0"+getFullNum();
			}
			else
				return "Your number is: "+getFullNum();
		}
		else{
			if(nums[0] == 0){
				return "The lottery number is: 0"+getFullNum();
			}
			else
				return "The lottery number is: "+getFullNum();
		}
	}
}
