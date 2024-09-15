
public class StringCharacters {
	public static void main(String[] args)
	{
		String text = "To be or not to be, that is the question;"
		+"Whether `tis nobler in the mind to suffer" 
		+" the slings and arrows of outrageous fortune,"
		+" or to take arms against a sea of troubles,"
		+" and by opposing end them?";
		int spaces = 0, vowels = 0, letters = 0;
		//YOUR CODE HERE
		int l = text.length();
		String str = text.toLowerCase();
		for(int i=0; i < l; i++) {
			if(str.charAt(i) == 'u' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'a' || str.charAt(i) == 'i') {
				vowels++;
			}
			if(str.charAt(i) == ' ') {
				spaces++;
			}
			if(Character.isLetter(str.charAt(i))) {
				letters++;
			}
		}
		System.out.println("The text contained vowels: " + vowels + "\n" 
		+ "consonants: " + (letters - vowels) + "\n" + "spaces: " + spaces);
	}
}
