package rollball4_score_and_events.model;


public class HitPickableEvent implements WorldEvent {

	private PickUpObj obj;
	
	public HitPickableEvent(PickUpObj obj){
		this.obj = obj;
	}
	
	public PickUpObj getCollisionObj(){
		return obj;
	}
}
