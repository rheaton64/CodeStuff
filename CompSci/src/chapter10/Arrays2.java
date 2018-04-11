package chapter10;

//Ryan
//Arrays class for Project 10.2

public class Arrays2 {
	//Counter variable
	private int count;
	
	//Instance variables
	private double avg;
	private double[] greater;
	//Constructor
	public Arrays2(){
		this.avg = avg;
		greater = new double[10];
	}
	//Method to set the avg and array
	public void setAvg(double[] nums){
		double sum = 0;
		for(int i = 0; i < nums.length; i++){
			sum += nums[i];
		}
		avg = sum/nums.length;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] > avg){
				greater[count] = nums[i];
				count++;
			}
		}
	}
	//toString method to print avg and array
	public String toString(){
		String grt = "Greater than the average: ";
		for(int i = 0; i < count; i++){
			grt += greater[i] + ", ";
		}
		grt = grt.substring(0, grt.length()-2);
		return "Average: "+avg+"\n"+grt;
	}
}
