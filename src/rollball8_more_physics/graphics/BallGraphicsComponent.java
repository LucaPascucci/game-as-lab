package rollball8_more_physics.graphics;

import rollball8_more_physics.model.*;

public class BallGraphicsComponent implements GraphicsComponent {

	@Override
	public void update(GameObject obj, Graphics g) {
		/*
		 * @TODO
		 * select the proper sprite according to the ball state... 
		 */
		g.drawBall(obj);
	}

}
