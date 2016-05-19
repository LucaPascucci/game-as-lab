package rollball6_game_over.physics;

import rollball6_game_over.common.P2d;

public class BoundaryCollision {

	public enum CollisionEdge { TOP, BOTTOM, LEFT, RIGHT }
	private CollisionEdge edge;
	private P2d where;
	
	public BoundaryCollision(CollisionEdge edge, P2d where){
		this.edge = edge; 
		this.where = where;
	}
	
	public CollisionEdge getEdge(){
		return edge;
	}
	
	public P2d getWhere(){
		return where;
	}
}
