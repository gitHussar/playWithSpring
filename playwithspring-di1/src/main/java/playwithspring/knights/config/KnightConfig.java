package playwithspring.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import playwithspring.knights.BraveKnight;
import playwithspring.knights.Knight;
import playwithspring.knights.Quest;
import playwithspring.knights.SlayDragonQuest;

@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }
  
  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }
}
