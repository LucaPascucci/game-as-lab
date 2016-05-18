package rollball3_collisions.model;

import rollball3_collisions.common.P2d;

public interface BoundingBox {

	boolean isCollidingWith(P2d p, double radius);
	
}
