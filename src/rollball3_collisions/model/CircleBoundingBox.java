package rollball3_collisions.model;

import rollball3_collisions.common.*;

public class CircleBoundingBox implements BoundingBox{

	private P2d center;
	private double radius;
	
	public CircleBoundingBox(P2d center, double radius){
		this.center = center;
		this.radius = radius;
	}
		
	public boolean isCollidingWith(P2d p, double radius){
		return new V2d(p,center).module() <= radius+this.radius;		
	}
}
