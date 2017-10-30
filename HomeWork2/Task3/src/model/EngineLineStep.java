package model;

public class EngineLineStep implements ILineStep {

	public Engine buildProductPart(){
		System.out.println("part: engine");
		return new Engine();
	}
}
