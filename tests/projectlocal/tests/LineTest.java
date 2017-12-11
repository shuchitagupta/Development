package projectlocal.tests;



import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import matchState.entities.*;


public class LineTest {
	Line line;
	int noOfPlayers =1;
	
  @Test
  //Checks whether addPlayers adds to arrayList
  //addPlayers method is being called in line constructor
  public void checkWhetheraddPlayersAddsToArrayList() {
		CoOrdinates p1 = new CoOrdinates(3,4);
		CoOrdinates p2 = new CoOrdinates(5,6);
		Team team = new Team("A");
		line = new Line(noOfPlayers, p1, p2, team);
	 	assertThat(line.list.get(0),notNullValue());
  }
}
