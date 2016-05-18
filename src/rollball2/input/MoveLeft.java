package rollball2.input;

import rollball2.common.V2d;
import rollball2.model.*;

public class MoveLeft implements Command {
	
	@Override
	public void execute(World scene) {
		Ball ball = scene.getBall();
		double speed = ball.getCurrentVel().module();
		ball.setVel(new V2d(-1,0).mul(speed));
	}

}
