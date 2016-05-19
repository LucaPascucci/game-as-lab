package rollball7_mosquito_AI.model;

import rollball7_mosquito_AI.common.*;

public class HitBorderEvent implements WorldEvent {

	private P2d where;
	
	public HitBorderEvent(P2d where){
		this.where = where;
	}
	
	public P2d getWhere(){
		return where;
	}
}
