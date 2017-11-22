package playwithspring.knights;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import playwithspring.knights.Knight;
//"file:src/test/resources/playwithspring/knights/KnightXMLInjectionTest-context.xml"
//
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations={"/META-INF/spring/KnightXMLInjectionTest-context.xml"}
    )
public class KnightXMLInjectionTest {

  @Autowired
  Knight knight;

  @Autowired
  FakePrintStream printStream;

  @After
  public void clearPrintStream() {
    printStream.clear();
  }

  @Test
  public void shouldInjectKnightWithSlayDragonQuest() {
    knight.embarkOnQuest();
    assertEquals(
        "Fa la la, the knight is so brave!\n" +
        "Embarking on quest to slay the dragon!\n" +
        "Tee hee hee, the brave knight did embark on a quest!\n", 
        printStream.getPrintedString());
  }

}
