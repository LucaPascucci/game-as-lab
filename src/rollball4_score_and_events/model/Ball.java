package rollball4_score_and_events.model;

import rollball4_score_and_events.common.*;

public class Ball extends GameObject {
	
	private double radius;
	
	public Ball(P2d pos, double radius, V2d vel){
		super(pos, vel, new CircleBoundingBox(new P2d(pos.x, pos.y), radius));
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
}
