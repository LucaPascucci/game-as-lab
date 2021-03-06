package rollball5_component.core;

import rollball5_component.common.P2d;
import rollball5_component.common.V2d;
import rollball5_component.model.*;
import rollball5_component.physics.*;
import rollball5_component.graphics.*;
import rollball5_component.input.*;

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
				new PlayerInputComponent(),
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
