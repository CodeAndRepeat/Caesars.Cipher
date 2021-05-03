package caesarscipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarsCuoherTest {
	
	private CaesarsCipher caesarCipher = new CaesarsCipher();

	@Test
	void testCiphereMessageWithOffsetOf12() {
		assertEquals("IW^U{_W { Z[ iWSS~ S||^[US[{z", caesarCipher.cipher("Welcome to this Ceasars application", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", caesarCipher.cipher("", 12));
	}

}
