package model;

public class AssemblyLine implements IAssemblyLine{
	
	ILineStep buildingBody;
	ILineStep buildingEngine;
	ILineStep buildingTower;
	
	public AssemblyLine(BodyLineStep buildingBody, EngineLineStep buildingEngine, TowerLineStep buildingTower){
		this.buildingBody=buildingBody;
		this.buildingEngine=buildingEngine;
		this.buildingTower=buildingTower;
	}
	public IProduct assembleProduct(IProduct product){
		product.installFirstPart(buildingBody.buildProductPart());
		product.installSecondPart(buildingEngine.buildProductPart());
		product.installThirdPart(buildingTower.buildProductPart());
		System.out.println("The product is ready");
		return product;
	}

}
