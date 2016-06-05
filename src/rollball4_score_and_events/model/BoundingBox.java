package rollball4_score_and_events.model;

import rollball4_score_and_events.common.P2d;

public interface BoundingBox {

	boolean isCollidingWith(P2d p, double radius);
	
}
