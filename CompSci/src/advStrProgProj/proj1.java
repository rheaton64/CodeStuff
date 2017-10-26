package advStrProgProj;

//Ryan
//Project 1 - Words in sentence

public class proj1 {
	public static void main(String[] args) {
		String str = proj1Methods.getInput();
		System.out.println("There are "+proj1Methods.wordsInSentence(str)+" word in your sentence");
		System.out.println("The average length of words in your sentence is "+proj1Methods.avgWords(str));
	}
}
