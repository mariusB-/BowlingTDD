package bowling;

import static org.junit.Assert.*;

import org.junit.*;

public class TestGame
{
	private Game game;

	@Before
	public void setUp()
	{
		game = new Game();
	}

	@Test
	public void TwoThrowsNoMark()
	{
		game.throwPins(5);
		game.throwPins(4);
		assertEquals(9, game.score());
	}
	
	/*
	@Test
	public void FourThrowsNoMark()
	{
		game.throwPins(5);
		game.throwPins(4);
		game.throwPins(7);
		game.throwPins(2);
		assertEquals(18, game.score());
		assertEquals(9,  game.scoreForFrame(1));
		assertEquals(18, game.scoreForFrame(2));
	}

	@Test
	public void SimpleSpare()
	{
		game.throwPins(3);
		game.throwPins(7);
		game.throwPins(3);
		assertEquals(13, game.scoreForFrame(1));
	}
	
	@Test
	public void SimpleFrameAfterSpare()
	{
		game.throwPins(3);
		game.throwPins(7);
		game.throwPins(3);
		game.throwPins(2);
		assertEquals(13, game.scoreForFrame(1));
		assertEquals(18, game.scoreForFrame(2));
		assertEquals(18, game.score());
	}

	
	@Test
	public void twoFivesThatDontMakeASpare()
	{
		game.throwPins(3);
		game.throwPins(5);
		game.throwPins(5);
		game.throwPins(2);
		
		assertEquals(8, game.scoreForFrame(1));
		assertEquals(15, game.scoreForFrame(2));
		assertEquals(15, game.score());
	}	
	
	@Test
	public void SimpleStrike()
	{
		game.throwPins(10);
		game.throwPins(3);
		game.throwPins(6);
		assertEquals(19, game.scoreForFrame(1));
		assertEquals(28, game.score());
	}
	
	@Test
	public void PerfectGame()
	{
		for (int i=0; i<12; i++)
		{
			game.throwPins(10);
		}
		game.printPins();
		assertEquals(300, game.score());
	}
	
	@Test
	public void SpareInLastFrame()
	{
		for (int i=0; i<9; i++)
		{
			game.throwPins(0);
			game.throwPins(0);
		}
		game.throwPins(2);
		game.throwPins(8); 
		game.throwPins(10); 
		assertEquals(20, game.score());
	}
	
	@Test
	public void SampleGame()
	{
		game.throwPins(1);
		game.throwPins(4);
		game.throwPins(4);
		game.throwPins(5);
		game.throwPins(6);
		game.throwPins(4);
		game.throwPins(5);
		game.throwPins(5);
		game.throwPins(10);
		game.throwPins(0);
		game.throwPins(1);
		game.throwPins(7);
		game.throwPins(3);
		game.throwPins(6);
		game.throwPins(4);
		game.throwPins(10);
		game.throwPins(2);
		game.throwPins(8);
		game.throwPins(6);
		assertEquals(133, game.score());
	}
	
	@Test
	public void HeartBreak()
	{
		for (int i=0; i<11; i++)
			game.throwPins(10);
		game.throwPins(9);
		assertEquals(299, game.score());
	}
	*/
}
