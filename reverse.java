import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        StringBuilder reversedWord = new StringBuilder(word);
        reversedWord.reverse();
        System.out.println("Reversed word is: " + reversedWord);
    }
}
