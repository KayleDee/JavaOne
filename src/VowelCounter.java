import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask the contestant for the phrase
        //Printing is System.out.print
        System.out.print("Phrase: ");
        String phrase = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison
        // Make a variable for each vowel
        // Int is the same
        int a = 0, e = 0, ii = 0, o = 0, u = 0;
        // Calculations
        // for, if and else if = for, if elif
        // .length() = len()
        for (int i = 0; i < phrase.length(); i++) {
            char currentChar = phrase.charAt(i);
            if (currentChar == 'a') {
                a = 1;
            } else if (currentChar == 'e') {
                e = 1;
            } else if (currentChar == 'i') {
                ii = 1;
            } else if (currentChar == 'o') {
                o = 1;
            } else if (currentChar == 'u') {
                u = 1;
            }
        }
        // Add up each vowel and print the total
        // need to put 'int' before you can use it to do things like subtraction, addition, multiplication, etc.
        int total = a + e + ii + o + u;
        int vowel = total * 250;
        // See how much you won!
        //Stops the code once it reaches scanner.close
        System.out.println("That's a $" + vowel + " phrase.");
        scanner.close();
    }
}

