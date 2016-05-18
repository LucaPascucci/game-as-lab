package rollball1;

import rollball1.core.GameEngine;


public class RollABall {

	public static void main(String[] args) {
		GameEngine engine = new GameEngine();
		engine.setup();
		engine.mainLoop();
	}

}
