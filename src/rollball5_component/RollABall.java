package rollball5_component;

import rollball5_component.core.GameEngine;

public class RollABall {

	public static void main(String[] args) {
		GameEngine engine = new GameEngine();
		engine.initGame();
		engine.mainLoop();
	}

}
