package projectlocal.tests;


import org.testng.annotations.Test;

import gameState.*;
import gui.MyPanel;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class GameStateManagerTest {
	
	MyPanel p = new MyPanel();
	GameStateManager gsm = new GameStateManager(p);
	
  @Test
  //To check that States are being added properly to the ArrayList
  public void checkNumberOfGameStates() {
	 // assertThat(gsm.getGameStates().size(),equalTo(6));
	  assertThat(gsm.getGameStates().get(2),notNullValue());
	 // assertThat(gsm.getGameStates().get(7),nullValue());
  }

  @Test
  //To check that MyPanel is being returned
  public void getMyPanel() {
	  assertThat(gsm.getMyPanel(),equalTo(p));
  }

  @Test
  public void setState() {
	  gsm.setState(3);
	  assertThat(gsm.getCurrentState(),equalTo(3));
  }
  
  
}
