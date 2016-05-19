package rollball5_component.physics;

import rollball5_component.common.*;
import rollball5_component.model.*;

public abstract class PhysicsComponent {

	public void update(int dt, GameObject obj, World w){
		P2d pos = obj.getCurrentPos();
		V2d vel = obj.getCurrentVel();
		obj.setPos(pos.sum(vel.mul(0.001*dt)));
	}
}
