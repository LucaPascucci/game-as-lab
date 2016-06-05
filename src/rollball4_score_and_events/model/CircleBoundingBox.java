package rollball4_score_and_events.model;

import rollball4_score_and_events.common.P2d;
import rollball4_score_and_events.common.V2d;

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
