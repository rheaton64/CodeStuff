package chapter10;

public class pracArray {
	public static void main(String[] args) {
		Strings();
	}
	public static void numsBy3() {
		int[] nums = new int[10];
		nums[0] = 10;
		for(int i = 1; i < nums.length; i++){
			nums[i] = nums[i-1]*3;
		}
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
		}
	}
	public static void Strings(){
		String[] alpha = {"a", "b", "c", "d", "e", "f"};
		for(int i = 0; i < alpha.length; i++){
			System.out.println(makeCopy(alpha)[i]);
		}
	}
	public static String[] makeCopy(String[] s){
		String[] copy = new String[s.length];
		for(int i = 0; i < s.length; i++){
			copy[i] = s[i];
		}
		return copy;
	}
}
