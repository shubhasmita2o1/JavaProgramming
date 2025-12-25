
public class Prefix {
	
	public static int isPrefixOfWord(String sentence, String searchWord) {
		String [] word = sentence.split(" ");
		for(int i=0; i< word.length;i++) {
			if(word[i].startsWith(searchWord)) {
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "i love eating burger";
		String searchWord = "burg";
		System.out.println(isPrefixOfWord(sentence,searchWord));

	}
}
