package rollball7_mosquito_AI.model;

import rollball7_mosquito_AI.common.P2d;
import rollball7_mosquito_AI.common.V2d;
import rollball7_mosquito_AI.core.GameFactory;
import rollball7_mosquito_AI.input.*;

public class GameState {
	
	private int score;
	private World world;
	
	public GameState(WorldEventListener l){
		GameFactory f = GameFactory.getInstance();
		
		score = 0;
		world = new World(new RectBoundingBox(new P2d(-9,8), new P2d(9,-8)));
		world.setBall(f.createBall(new P2d(0,0), 1, new V2d(8,3), new MosquitoAIInputComponent()));
		world.addPickUp(f.createPickUpObject(new P2d(0,5), 1));
		world.addPickUp(f.createPickUpObject(new P2d(6,0), 1));
		world.addPickUp(f.createPickUpObject(new P2d(-4,3), 1));
		world.addPickUp(f.createPickUpObject(new P2d(-1,-7), 1));
		world.setEventListener(l);
	}
	
	public World getWorld(){
		return world;
	}
	
	public void incScore(){
		score++;
	}

	public void decScore(){
		score--;
	}
	
	public int getScore(){
		return score;
	}
	
	public boolean isGameOver(){
		return world.getPickableObj().size() == 0;
	}
	
	public void update(int dt){
		world.updateState(dt);
	}
}
