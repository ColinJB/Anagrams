import java.util.Collection;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Anagrams {

  public boolean anagramCheck(String word1, String word2) {
    String[] splitWord1 = word1.split("");
    String[] splitWord2 = word2.split("");
    List<String> splitWordList1 = new ArrayList<String>(Arrays.asList(splitWord1));
    List<String> splitWordList2 = new ArrayList<String>(Arrays.asList(splitWord2));
    if ( splitWordList1.containsAll(splitWordList2) ) {
      return true;
    } else {
      return false;
    }

  }
}
