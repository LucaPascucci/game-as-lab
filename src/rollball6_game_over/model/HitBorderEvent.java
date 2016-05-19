package rollball6_game_over.model;

import rollball6_game_over.common.*;

public class HitBorderEvent implements WorldEvent {

	private P2d where;
	
	public HitBorderEvent(P2d where){
		this.where = where;
	}
	
	public P2d getWhere(){
		return where;
	}
}
