package rollball4_score_and_events.model;

import rollball4_score_and_events.common.*;

public class HitBorderEvent implements WorldEvent {

	private P2d where;
	
	public HitBorderEvent(P2d where){
		this.where = where;
	}
	
	public P2d getWhere(){
		return where;
	}
}
