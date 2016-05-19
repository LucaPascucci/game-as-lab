package rollball5_component.model;

import rollball5_component.common.P2d;

public interface BoundingBox {

	boolean isCollidingWith(P2d p, double radius);
	
}
