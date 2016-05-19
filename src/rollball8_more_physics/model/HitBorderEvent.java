package rollball8_more_physics.model;

import rollball8_more_physics.common.*;

public class HitBorderEvent implements WorldEvent {

	private P2d where;
	
	public HitBorderEvent(P2d where){
		this.where = where;
	}
	
	public P2d getWhere(){
		return where;
	}
}
