
public class SortString {
	public static void main(String[] args)
	{
		String text = "To be or not to be, that is the question;"
		+"Whether `tis nobler in the mind to suffer" 
		+" the slings and arrows of outrageous fortune,"
		+" or to take arms against a sea of troubles,"
		+" and by opposing end them?";
		
		// count the number of words
		int wordNum = 0;
		int strlength = text.length();
		boolean isword = false;
		for (int i = 0; i<strlength; i++) {
			if(isword) {
				if(Character.isLetter(text.charAt(i)) || text.charAt(i) == '\'') {
					continue;
				} else {
					isword = false;
				}
			}
			else if(Character.isLetter(text.charAt(i))) {
				wordNum++;
				isword = true;
			}
		}
		System.out.println("Number of words: " + wordNum);
		
		// extract the words from text
		int startpoint = 0, count = 0;						// I use string method substring that needs start point and end point to extract a word from text
		String[] words = new String[wordNum]; 	// create a string array to store words
		isword = false;
		for (int i = 0; i<strlength; i++) {
			if(isword) {
				if(Character.isLetter(text.charAt(i)) || text.charAt(i) == '\'') {
					continue;
				} else {
					if(count == wordNum) {
						words[count] = text.substring(startpoint);
						break;
					}
					words[count++] = text.substring(startpoint, i);
					isword = false;
				}
			}
			else if(Character.isLetter(text.charAt(i))) {
				startpoint = i;
				isword = true;
			}
		}
		
		// sort the words into alphabetical order
		boolean changeFlag = true;
		String temp = null;
		while(changeFlag) {
			changeFlag = false;
			for(int i=0; i<(wordNum - 1); i++) {
				if(words[i].compareToIgnoreCase(words[i+1]) > 0) {
					temp = words[i];
					words[i] = words[i+1];
					words[i+1] = temp;
					changeFlag = true;
				}
			}
		}
		for(String word: words) {
			System.out.println(word);
		}
	}
}
