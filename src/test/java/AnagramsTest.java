import org.junit.*;
import static org.junit.Assert.*;

public class AnagramsTest {

  @Test
  public void anagramCheck_instantiatesCorrectly_true() {
    Anagrams testAnagrams = new Anagrams();
    assertEquals(true, testAnagrams instanceof Anagrams);
  }

  @Test
  public void anagramCheck_instantiatesString_String() {
    Anagrams testAnagrams = new Anagrams();
    String expected = "";
    assertEquals(expected, testAnagrams.anagramCheck("", ""));
  }
}
