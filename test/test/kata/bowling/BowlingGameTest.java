package test.kata.bowling;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import kata.bowling.BowlingGame;

public class BowlingGameTest {

	@Test
	public void all_gutter() {
		assertEquals(BowlingGame.startGame("-- -- -- -- -- -- -- -- -- --").getScore(),0);
	}
	
	@Test
	public void no_spare_no_strike() {
		assertEquals(BowlingGame.startGame("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-").getScore(),90);
	}
	
	@Test
	public void no_strike_few_spare() {
		assertEquals(BowlingGame.startGame("5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5").getScore(),150);
	}
	
	@Test
	public void all_strike() {
		assertEquals(BowlingGame.startGame("X X X X X X X X X X X X").getScore(),300);
	}
}
