import java.util.Scanner;
public class Encryption2{
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	private static String cipherAlphabet;
	private static int shiftKey;
	public static void setShiftKey(int shiftKey){
		Encryption2.shiftKey = shiftKey;
		cipherAlphabet = generateCipherAlphabet(shiftKey);
	}
	
	private static String generateCipherAlphabet(int shiftKey) {
		String shifted = ALPHABET.substring(shiftKey) + ALPHABET.substring(0, shiftKey);
		return shifted;
	}
	
	public static void displayAlphabets() {
		System.out.println("Alphabet: " + ALPHABET);
		System.out.println("Cipher Alphabet: " + cipherAlphabet);
	}
	
	public static String encrypt(String message) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			char c = message.charAt(i);
			if (Character.isLetter(c)){
				int index = ALPHABET.indexOf(Character.toLowerCase(c));
				if (index != -1){
					char shifted = cipherAlphabet.charAt(index);
					if (Character.isUpperCase(c)){
						shifted = Character.toUpperCase(shifted);
					}
					sb.append(shifted);
					continue;
				}
			}
			sb.append(c);
		}
		return sb.toString();
	}
	public static void encryptMessage() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter plaintext message (type 'quit' to exit): ");
			String plaintext = sc.nextLine();
			if (plaintext.equalsIgnoreCase("quit")) {
				break;
			}
			String encrypted = encrypt(plaintext);
			System.out.println("Encrypted message: " + encrypted);
		}
	}
}