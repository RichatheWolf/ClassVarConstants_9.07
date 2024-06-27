import java.util.Scanner;
public class Decryption2{
	public static void decryptMessage() {
		// create a Scanner object to read input from the console
		Scanner sc = new Scanner(System.in);
		
		// prompt the user to enter the ciphertext message
		System.out.print("Enter ciphertext message: ");
		String ciphertext = sc.nextLine();
		
		// try all 26 possible shift keys
		for (int i = 0; i < 26; i++) {
			// set the shift key for Encryption class to the current shift key being tried
			Encryption2.setShiftKey(i);
			
			// decrypt the ciphertext using the current shift key and display the decrypted message
			String decrypted = Encryption2.encrypt(ciphertext);
			System.out.println("Decrypted message (Shift key = " + i + "): " + decrypted);
		}
	}
}