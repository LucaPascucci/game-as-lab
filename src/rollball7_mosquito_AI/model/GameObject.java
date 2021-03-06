package rollball7_mosquito_AI.model;

import rollball7_mosquito_AI.common.*;
import rollball7_mosquito_AI.graphics.*;
import rollball7_mosquito_AI.input.*;
import rollball7_mosquito_AI.physics.*;

public class GameObject {

	public static enum Type { BALL, PICKABLE_OBJ }

	private Type type;
	private P2d pos;
	private V2d vel;
	private BoundingBox bbox;
	
	private InputComponent input;
	private GraphicsComponent graph;
	private PhysicsComponent phys;
	
	public GameObject(Type type, P2d pos, V2d vel, BoundingBox box, InputComponent input, GraphicsComponent graph, PhysicsComponent phys){
		this.type = type;
		this.pos = pos;
		this.vel = vel;
		this.bbox = box;
		this.input = input;
		this.graph = graph;
		this.phys = phys;
	}
	
	public Type getType(){
		return type;
	}
	
	public void setPos(P2d pos){
		this.pos = pos;
	}

	public void setVel(V2d vel){
		this.vel = vel;
	}

	public void flipVelOnY(){
		this.vel = new V2d(vel.x, -vel.y);
	}

	public void flipVelOnX(){
		this.vel = new V2d(-vel.x, vel.y);
	}
	
	public BoundingBox getBBox(){
		return bbox;
	}
	
	public P2d getCurrentPos(){
		return pos;
	}
	
	public V2d getCurrentVel(){
		return vel;
	}

	public void updateInput(InputController c){
		input.update(this, c);
	}

	public void updatePhysics(int dt, World w){
		phys.update(dt, this, w);
	}
	
	public void updateGraphics(Graphics g){
		graph.update(this, g);
	}
	
}
