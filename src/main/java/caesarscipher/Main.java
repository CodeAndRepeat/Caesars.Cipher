package caesarscipher;

public class Main {

	public static void main(String[] args) {
		
		String message = "Welcome to this Ceasars application";
		int offset = 12; 
		
		CaesarsCipher caesarsCipher = new CaesarsCipher(); 
		String cipherMessage = caesarsCipher.cipher(message, offset);
		
		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Cipher message: " + cipherMessage);

	}
}
