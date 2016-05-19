package rollball7_mosquito_AI.graphics;

import rollball7_mosquito_AI.model.GameObject;

public class PickUpObjGraphicsComponent implements GraphicsComponent {

	@Override
	public void update(GameObject obj, Graphics w) {
		w.drawPickableObj(obj);
	}

}
