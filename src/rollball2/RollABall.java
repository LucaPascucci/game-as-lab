package rollball2;

import rollball2.core.GameEngine;

public class RollABall {

	public static void main(String[] args) {
		GameEngine engine = new GameEngine();
		engine.setup();
		engine.mainLoop();
	}

}
