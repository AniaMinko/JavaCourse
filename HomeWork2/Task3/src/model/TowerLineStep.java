package model;

public class TowerLineStep implements ILineStep{

	public Tower buildProductPart(){
		System.out.println("part: tower");
		return new Tower();
	}
}
