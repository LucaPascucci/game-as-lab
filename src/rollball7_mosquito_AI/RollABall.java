package rollball7_mosquito_AI;

import rollball7_mosquito_AI.core.GameEngine;

public class RollABall {

	public static void main(String[] args) {
		GameEngine engine = new GameEngine();
		engine.initGame();
		engine.mainLoop();
	}

}
