package projectlocal.tests;


import matchState.*;
import matchState.entities.*;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class MatchBuilderTest {
	private  AutomatedTeam team1;
	private Team team;
	private MatchBuilder builder = MatchBuilder.getBuilderInstance();;
	private Match match=builder.makeBall().getMatch();
	
 
	@Test
  //Checks whether builder is returned
  public void shouldReturnBuilderObjectWhenCreatedUsingTeam1makeLines() {
	  team = new Team(null);
	  int x=0,y=1,z=2;
	  assertThat(builder.Team1makeLines(team, x ,y, z), equalTo(builder));
  }

	@Test
  //Checks whether builder is returned
  public void shouldReturnBuilderObjectWhenCreatedUsingTeam2makeLines() {
	  team = new Team(null);
	  int x =0,y=9,z=10;
	  assertThat(builder.Team2makeLines(team, x, y, z),equalTo(builder));
  }

	@Test
  //Checks whether builder is returned
  public void shouldReturnBuilderObjectWhenCreatedUsinggetBuilderInstance() {
	  assertThat(builder.getBuilderInstance(),equalTo(builder));
  }

	@Test
  //Checks if Single Instance of Match is created
  public void shouldReturnMatchObject() {
	  match = builder.getMatch();
	  assertThat(builder.getMatch(),theInstance(match));  
    
  }

	@Test
//Checks if Ball is created
  public void shouldReturnBallObject() {
	  builder.makeBall();
	  assertThat(match.ball,notNullValue());
  }

	@Test
  //Checks if TeamA and TeamB are instances of UserDefinedTeams
  public void shouldCreateTeamsUsingmakeMultiPlayerTeams() {
	 String name1="A",name2="B";
	 match=builder.makeBall().makeMultiPlayerTeams(name1,name2).getMatch();
	
	assertThat(match.teamA,instanceOf(UserDefinedTeam.class));
	assertThat(match.teamB,instanceOf(UserDefinedTeam.class));
  }

	@Test
 //Checks if TeamA instance of UserDefinedTeam and TeamB instance of AutomatedTeam
  public void shouldCreateTeamsUsingmakeSinglePlayerTeams() {
    String name1="C",name2="D";
    match=builder.makeBall().makeSinglePlayerTeams(name1,name2).getMatch();
    
    assertThat(match.teamA,instanceOf(UserDefinedTeam.class));
	assertThat(match.teamB,instanceOf(AutomatedTeam.class));
  }
 
	@Test
 //Checks if Difficulty Level is set
 public void checkWhetherDifficultyLevelIsSet(){
	 DifficultyLevel Novice = new Novice(match);
	 match=builder.addDifficultyLevel(Novice).getMatch();
	 assertThat(match.level,notNullValue());
 }
  
}
