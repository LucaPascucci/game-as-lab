package rollball5_component.graphics;

import rollball5_component.model.GameObject;

public class PickUpObjGraphicsComponent implements GraphicsComponent {

	@Override
	public void update(GameObject obj, Graphics w) {
		w.drawPickableObj(obj);
	}

}
