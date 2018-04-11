package twoDArray;

// Ryan
// 2/26/18
// 2D-Array Program - Create methods to manipulate a 2D-Array

public class TwoDArray {
	//Main method
	public static void main(String[] args) {
		int nums[][] = {{2,4,1,3},
						{3,6,1,2},
						{4,7,1,8}};
		print(nums);
		System.out.println();
		sumRows(nums);
		System.out.println();
		sumCols(nums);
		System.out.println();
		largestInRows(nums);
		System.out.println();
		largestInCols(nums);
	}
	//Print method
	public static void print(int[][] a){
		for(int r = 0; r < a.length; r++){
			for(int c = 0; c < a[0].length; c++){
				System.out.print(a[r][c]);
			}
			System.out.println();
		}
	}
	//Method to get sum of rows
	public static void sumRows(int[][] a){
		System.out.println(" - Sum of Rows - ");
		int sum = 0;
		for(int r = 0; r < a.length; r++){
			int rSum = 0;
			for(int c = 0; c < a[0].length; c++){
				rSum += a[r][c];
			}
			System.out.println("Row "+(r+1)+": "+rSum);
			sum += rSum;
		}
		System.out.println("Total: "+sum);
	}
	//Method to get sum of columns
	public static void sumCols(int[][] a){
		System.out.println(" - Sum of Columns - ");
		int sum = 0;
		for(int c = 0; c < a[0].length; c++){
			int cSum = 0;
			for(int r = 0; r < a.length; r++){
				cSum += a[r][c];
			}
			System.out.println("Column "+(c+1)+": "+cSum);
			sum += cSum;
		}
		System.out.println("Total: "+sum);
	}
	//Method to get the largest value in each row
	public static void largestInRows(int[][] a){
		System.out.println(" - Largest in Rows - ");
		for(int r = 0; r < a.length; r++){
			int max = 0;
			for(int c = 0; c < a[0].length; c++){
				if(a[r][c] > max){
					max = a[r][c];
				}
			}
			System.out.println("Row "+(r+1)+": "+max);
		}
	}
	//Method to get the largest value in each column
	public static void largestInCols(int[][] a){
		System.out.println(" - Largest in Columns - ");
		for(int c = 0; c < a[0].length; c++){
			int max = 0;
			for(int r = 0; r < a.length; r++){
				if(a[r][c] > max){
					max = a[r][c];
				}
			}
			System.out.println("Column "+(c+1)+": "+max);
		}
	}
}