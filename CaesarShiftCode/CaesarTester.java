import java.util.Scanner;

public class CaesarTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Prompt user to enter shift key value and set the shift key
		System.out.print("Enter shift key value (0-25): ");
		int shiftKey = sc.nextInt();
		Encryption2.setShiftKey(shiftKey);
		// Display the alphabet and the cipher alphabet for the chosen shift key
		Encryption2.displayAlphabets();
		// Loop to repeatedly ask the user for an option until the user quits
		while (true) {
			// Prompt user to choose an option: encrypt, decrypt or quit
			System.out.print("Choose an option:\n1. Encrypt message\n2. Decrypt message\n3. Quit\nEnter option number: ");
			int option = sc.nextInt();
			sc.nextLine(); // consume newline character
			switch (option) {
				case 1:
					Encryption2.encryptMessage(); // Call encryptMessage() method from Encryption class
					break;
				case 2:
					Decryption2.decryptMessage(); // Call decryptMessage() method from Decryption class
					break;
				case 3:
					System.exit(0); // Exit the program
					break;
				default:
					System.out.println("Invalid option. Please enter 1, 2 or 3.");
			}
		}
	}
}