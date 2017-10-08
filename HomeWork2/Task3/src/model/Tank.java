package model;

public class Tank implements IProduct{

	public void installFirstPart(IProductPart body){
		System.out.println("Install body");
	}
	public void installSecondPart(IProductPart engine){
		System.out.println("Install engine");
	}
	public void installThirdPart(IProductPart tower){
		System.out.println("Install tower");
	}
}
