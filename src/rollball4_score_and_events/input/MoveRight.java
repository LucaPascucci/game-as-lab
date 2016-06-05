package rollball4_score_and_events.input;

import rollball4_score_and_events.common.V2d;
import rollball4_score_and_events.model.*;

public class MoveRight implements Command {
	
	@Override
	public void execute(GameState state) {
		Ball ball = state.getWorld().getBall();
		double speed = ball.getCurrentVel().module();
		ball.setVel(new V2d(1,0).mul(speed));
	}

}
