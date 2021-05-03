package caesarscipher;

public class CaesarsCioher {
	private static final char LETTER_A = 'a';
	private static final char LETTER_Z = 'z';
	private static final int ALPHABET_SIZE = 26;
	
	public String cipher(String message, int offset) {
		offset %= ALPHABET_SIZE;
		char[] character = message.toCharArray();
		shift(character, offset);
		return new String(character);
	}
}
