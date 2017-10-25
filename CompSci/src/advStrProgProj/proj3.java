package advStrProgProj;

//Ryan
//Project 3 - Count and replace vowels in a sentence

public class proj3 {
	public static void main(String[] args) {
		String str = proj3Methods.sentInput();
		System.out.println("The are "+proj3Methods.countVowels(str)+" vowels in your sentence");
		System.out.println("Your sentence without vowels is"+proj3Methods.removeVowels(str));
	}
}
