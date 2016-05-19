package rollball8_more_physics.model;

import rollball8_more_physics.common.P2d;

public interface BoundingBox {

	boolean isCollidingWith(P2d p, double radius);
	
}
