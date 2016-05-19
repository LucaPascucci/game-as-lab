package rollball7_mosquito_AI.model;

import rollball7_mosquito_AI.common.P2d;
import rollball7_mosquito_AI.common.V2d;

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
