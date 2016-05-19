package rollball8_more_physics.graphics;

import rollball8_more_physics.model.GameObject;

public class PickUpObjGraphicsComponent implements GraphicsComponent {

	@Override
	public void update(GameObject obj, Graphics w) {
		w.drawPickableObj(obj);
	}

}
