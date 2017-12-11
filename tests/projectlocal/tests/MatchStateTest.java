package projectlocal.tests;

import gameState.*;
import gui.MyPanel;
import matchState.entities.Ball;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MatchStateTest {
	MyPanel panel = new MyPanel();
	GameStateManager gsm = new GameStateManager(panel);
	MatchState m = new MatchState(gsm);
 
	@Test
	public void checkWhetherBallUsedIsSame() {
		assertThat(m,notNullValue());
  }
}
