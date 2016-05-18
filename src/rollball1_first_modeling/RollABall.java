package rollball1_first_modeling;

import rollball1_first_modeling.core.GameEngine;


public class RollABall {

	public static void main(String[] args) {
		GameEngine engine = new GameEngine();
		engine.setup();
		engine.mainLoop();
	}

}
