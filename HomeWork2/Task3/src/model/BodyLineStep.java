package model;

public class BodyLineStep implements ILineStep{

	public Body buildProductPart(){
		System.out.println("part: body");
		return new Body();
	}
}
