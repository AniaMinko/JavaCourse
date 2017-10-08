package model;

public class AssemblyLine implements IAssemblyLine{
	
	ILineStep body;
	ILineStep engine;
	ILineStep tower;
	
	public AssemblyLine(BodyLineStep body, EngineLineStep engine, TowerLineStep tower){
		this.body=body;
		this.engine=engine;
		this.tower = tower;
	}
	public IProduct assembleProduct(IProduct product){
		product.installFirstPart(body.buildProductPart());
		product.installSecondPart(engine.buildProductPart());
		product.installThirdPart(tower.buildProductPart());
		System.out.println("The product is ready");
		return product;
	}

}
