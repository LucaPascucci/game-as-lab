package rollball2_input_proc;

import rollball2_input_proc.core.GameEngine;

public class RollABall {

	public static void main(String[] args) {
		GameEngine engine = new GameEngine();
		engine.setup();
		engine.mainLoop();
	}

}
