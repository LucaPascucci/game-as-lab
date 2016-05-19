package rollball7_mosquito_AI.model;

import rollball7_mosquito_AI.common.P2d;

public interface BoundingBox {

	boolean isCollidingWith(P2d p, double radius);
	
}
