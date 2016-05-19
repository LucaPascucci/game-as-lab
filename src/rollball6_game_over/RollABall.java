package rollball6_game_over;

import rollball6_game_over.core.GameEngine;

public class RollABall {

	public static void main(String[] args) {
		GameEngine engine = new GameEngine();
		engine.initGame();
		engine.mainLoop();
	}

}
