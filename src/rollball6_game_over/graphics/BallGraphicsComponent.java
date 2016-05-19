package rollball6_game_over.graphics;

import rollball6_game_over.model.*;

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
