package rollball6_game_over.physics;

import rollball6_game_over.common.*;
import rollball6_game_over.model.*;

public abstract class PhysicsComponent {

	public void update(int dt, GameObject obj, World w){
		P2d pos = obj.getCurrentPos();
		V2d vel = obj.getCurrentVel();
		obj.setPos(pos.sum(vel.mul(0.001*dt)));
	}
}
