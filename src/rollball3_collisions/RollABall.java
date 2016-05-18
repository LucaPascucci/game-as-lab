package rollball3_collisions;

import rollball3_collisions.core.GameEngine;

public class RollABall {

	public static void main(String[] args) {
		GameEngine engine = new GameEngine();
		engine.setup();
		engine.mainLoop();
	}

}
