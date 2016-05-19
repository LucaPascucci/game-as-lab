package rollball8_more_physics.core;

import rollball8_more_physics.common.*;
import rollball8_more_physics.model.*;
import rollball8_more_physics.physics.*;
import rollball8_more_physics.graphics.*;
import rollball8_more_physics.input.*;

public class GameFactory {

	static private GameFactory instance;
	
	static public GameFactory getInstance(){
		if (instance == null){
			instance = new GameFactory();
		}
		return instance;
	}
	
	public GameObject createBall(P2d pos, double radius, V2d vel){
		return new GameObject(GameObject.Type.BALL, pos, vel, new CircleBoundingBox(new P2d(pos.x, pos.y), radius),
				new PlayerInputComponentWithAcc(),
				new BallGraphicsComponent(),
				new BallPhysicsComponent());
	}
	
	public GameObject createPickUpObject(P2d pos, double edge){
		return new GameObject(GameObject.Type.PICKABLE_OBJ, pos, new V2d(0,0), new CircleBoundingBox(new P2d(pos.x, pos.y), edge/2),
				new NullInputComponent(),
				new PickUpObjGraphicsComponent(),
				new PickUpObjPhysicsComponent());
	}
}
