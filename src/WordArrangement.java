import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordArrangement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Reading
        int K = scanner.nextInt(); // Number of words
        scanner.nextLine(); // Consume remaining newline
        List<String> words = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            words.add(scanner.nextLine().trim());
        }

        int N = scanner.nextInt(); // Number of lines
        int M = scanner.nextInt(); // Max length per line

        // Sort words by length to ensure shorter words can fit better
        Collections.sort(words, (a, b) -> a.length() - b.length());

        // Calculate the maximum number of words that can be arranged
        int maxWords = maxWordsInLines(words, N, M);

        // Output the result
        System.out.print(maxWords);

        scanner.close();
    }

    private static int maxWordsInLines(List<String> words, int N, int M) {
        int currentLineLength = 0;
        int linesUsed = 1;
        int wordsUsed = 0;

        for (String word : words) {
            int wordLength = word.length();

            // Check if the current word fits in the current line
            if (wordLength > M) {
                continue; // Skip words that are too long
            }

            // If adding this word exceeds the line length, we need to move to the next line
            if (currentLineLength + (currentLineLength > 0 ? 1 : 0) + wordLength > M) {
                linesUsed++;
                currentLineLength = 0; // Reset line length for the new line

                if (linesUsed > N) { // If no more lines are available, stop
                    break;
                }
            }

            // Add the word to the current line
            if (currentLineLength > 0) { // If it's not the first word in the line
                currentLineLength += 1; // Add space before the word
            }
            currentLineLength += wordLength;
            wordsUsed++;
        }

        return wordsUsed;
    }
}