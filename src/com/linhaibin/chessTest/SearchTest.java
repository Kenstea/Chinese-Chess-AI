package com.linhaibin.chessTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.linhaibin.chess.Game;
import com.linhaibin.chess.Search;
import com.linhaibin.chess.State;
import com.linhaibin.chess.UserMove;

public class SearchTest {

	State state;
	@Before
	public void setUp() throws Exception {
		state = new State();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLevelOne() {
		State chosenState = (Search.minMaxSearch(state, 1));
		System.out.println(chosenState);
		assert(true);
	}
	

	@Test
	public void testLevelThreeKill() {
		State midState;
		int fromX = 0;
		int fromY = 9;
		int toX = 4;
		int toY = 3;
		
		midState = UserMove.movePiece(state, fromX, fromY, toX, toY);
		State chosenState = (Search.minMaxSearch(midState, 3));
		System.out.println(chosenState);
		assert(true);
	}
}