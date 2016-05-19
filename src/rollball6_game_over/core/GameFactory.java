package rollball6_game_over.core;

import rollball6_game_over.common.P2d;
import rollball6_game_over.common.V2d;
import rollball6_game_over.model.*;
import rollball6_game_over.physics.*;
import rollball6_game_over.graphics.*;
import rollball6_game_over.input.*;

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
