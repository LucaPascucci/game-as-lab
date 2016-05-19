package rollball6_game_over.model;

import rollball6_game_over.common.P2d;
import rollball6_game_over.common.V2d;

public class CircleBoundingBox implements BoundingBox{

	private P2d center;
	private double radius;
	
	public CircleBoundingBox(P2d center, double radius){
		this.center = center;
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public boolean isCollidingWith(P2d p, double radius){
		return new V2d(p,center).module() <= radius+this.radius;		
	}
}
