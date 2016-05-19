package rollball6_game_over.model;

import rollball6_game_over.common.P2d;

public interface BoundingBox {

	boolean isCollidingWith(P2d p, double radius);
	
}
