package playwithspring.knights;
import static org.mockito.Mockito.*;

import org.junit.Test;

import playwithspring.knights.BraveKnight;
import playwithspring.knights.Quest;

public class BraveKnightTest {

  @Test
  public void knightShouldEmbarkOnQuest() {
    Quest mockQuest = mock(Quest.class);
    BraveKnight knight = new BraveKnight(mockQuest);
    knight.embarkOnQuest();
    verify(mockQuest, times(1)).embark();
  }

}
