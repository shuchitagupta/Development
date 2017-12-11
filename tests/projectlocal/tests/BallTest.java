package projectlocal.tests;

import matchState.entities.*;
import matchState.entities.Ball;
import matchState.entities.Interfaces.*;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BallTest {
	private Ball ball = Ball.getInstance();
	
  @Test
  //Checks whether single object is being created
  public void checkWhetherSingleInstanceOfBallIsCreated() {
	  assertThat(Ball.getInstance(),equalTo(ball));
  }
  
  @Test
  //Checks whether CoOrdinates are being Changed
  public void checkWhetherCoOrdinatesAreBeingChanged(){
	  ball.position.x=10;
	  ball.position.y=20;
	  CoOrdinates position1 = new CoOrdinates(10,20);
	  Thread ballThread = new Thread(ball);
	  ballThread.start();
	  assertThat(ball.position,not(position1));
  }
  
  
  
 
}
