package rollball3_collisions.model;

import rollball3_collisions.common.*;

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
