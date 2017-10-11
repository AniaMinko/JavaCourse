package model;

public class Tank implements IProduct{

	Body body;
	Engine engine;
	Tower tower;
	public void installFirstPart(IProductPart body){
		this.body=(Body)body;
		System.out.println("Install body");
	}
	public void installSecondPart(IProductPart engine){
		this.engine=(Engine)engine;
		System.out.println("Install engine");
	}
	public void installThirdPart(IProductPart tower){
		this.tower=(Tower)tower;
		System.out.println("Install tower");
	}
}
