package PracticeAbstraction;

//Ryan
//Calculate the average of 3 numbers

public class calculateAverage {
	static calculation c = new calculation();
	public static void main(String[] args) {
		System.out.println("Average = "+c.calculate(c.getInput(), c.getInput(), c.getInput()));
	}
}
