package rollball4_score_and_events;

import rollball4_score_and_events.core.GameEngine;

public class RollABall {

	public static void main(String[] args) {
		GameEngine engine = new GameEngine();
		engine.initGame();
		engine.mainLoop();
	}

}
