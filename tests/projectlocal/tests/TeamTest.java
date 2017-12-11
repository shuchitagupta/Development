package projectlocal.tests;

import java.lang.reflect.Array;

import matchState.entities.*;
import matchState.entities.Interfaces.AttackerLine;
import matchState.entities.Interfaces.DefenderLine;
import matchState.entities.Interfaces.GoalKeeperLine;
import matchState.entities.Interfaces.MidFielderLine;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TeamTest {
	Team team = new Team("A");
	CoOrdinates c1 = new CoOrdinates(30,80);
	CoOrdinates c2 = new CoOrdinates(40,90);
	GoalKeeperLine keepLine = new Line(1, c1, c2, team);
	DefenderLine defline = new Line(1,c1, c2, team);
	MidFielderLine midLine = new Line(2, c1, c2, team);
	AttackerLine attackLine = new Line(3, c1, c2, team);
	
	
	@Test
	public void checkWhetherLinesAreBeingSet() {
		team.setLines(keepLine, defline, midLine, attackLine);
		assertThat(team.defLine,notNullValue());
		assertThat(team.keepLine,notNullValue());
		assertThat(team.midfieldLine,notNullValue());
		assertThat(team.attackLine,notNullValue());
	    
	  }
  
}
