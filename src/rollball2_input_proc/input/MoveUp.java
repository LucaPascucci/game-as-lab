package rollball2_input_proc.input;

import rollball2_input_proc.common.V2d;
import rollball2_input_proc.model.*;

public class MoveUp implements Command {
	@Override
	public void execute(World scene) {
		Ball ball = scene.getBall();
		double speed = ball.getCurrentVel().module();
		ball.setVel(new V2d(0,1).mul(speed));
	}

}
