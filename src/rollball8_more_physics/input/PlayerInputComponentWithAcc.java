package rollball8_more_physics.input;

import rollball8_more_physics.common.V2d;
import rollball8_more_physics.model.*;

public class PlayerInputComponentWithAcc implements InputComponent {

	public void update(GameObject ball, InputController ctrl){
		V2d vel = ball.getCurrentVel();
		if (ctrl.isMoveUp()){
			ball.setVel(vel.sum(new V2d(0,0.2)));
		} else if (ctrl.isMoveDown()){
			ball.setVel(vel.sum(new V2d(0,-0.2)));
		} else if (ctrl.isMoveLeft()){
			ball.setVel(vel.sum(new V2d(-0.2,0)));
		} else if (ctrl.isMoveRight()){
			ball.setVel(vel.sum(new V2d(0.2,0)));
		}
	
	}

}
