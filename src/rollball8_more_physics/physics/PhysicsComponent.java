package rollball8_more_physics.physics;

import rollball8_more_physics.common.*;
import rollball8_more_physics.model.*;

public abstract class PhysicsComponent {

	public void update(int dt, GameObject obj, World w){
		P2d pos = obj.getCurrentPos();
		V2d vel = obj.getCurrentVel();
		obj.setPos(pos.sum(vel.mul(0.001*dt)));
	}
}
