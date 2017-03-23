import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console userConsole = System.console();
    System.out.println("Welcome to the Anagram checker! Enter two words, and I will tell you if they are anagrams!");
    System.out.println("Please enter the first word.");
    String word1 = userConsole.readLine();
    System.out.println("Please enter the second word.");
    String word2 = userConsole.readLine();
    Anagrams anagrams = new Anagrams();
    boolean result = anagrams.anagramCheck(word1, word2);
    System.out.println(result);
  }
}
