import java.util.Scanner;

public class CaesarCipher {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String text, int shift) {
        text = text.toUpperCase();
        StringBuilder encryptedText = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (ALPHABET.indexOf(c) != -1) {
                int originalPosition = ALPHABET.indexOf(c);
                int newPosition = (originalPosition + shift) % 26;
                encryptedText.append(ALPHABET.charAt(newPosition));
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Caesar Cipher - Şifreleme ve Şifre Çözme Uygulaması");
        System.out.println("1. Şifreleme Yap");
        System.out.println("2. Şifre Çözme Yap");
        System.out.print("Seçiminizi yapın (1/2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Anahtar değerini girin (0-25): ");
        int shift = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Metni girin: ");
        String text = scanner.nextLine();

        if (choice == 1) {
            System.out.println("Şifrelenmiş Metin: " + encrypt(text, shift));
        } else if (choice == 2) {
            System.out.println("Çözülen Metin: " + decrypt(text, shift));
        } else {
            System.out.println("Geçersiz seçim!");
        }

        scanner.close();
    }
}
