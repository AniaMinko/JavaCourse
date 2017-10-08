package model;

public class Program {

	public static void main(String[] args) {
		
		AssemblyLine line = new AssemblyLine(new BodyLineStep(), new EngineLineStep(), new TowerLineStep());
        Tank tank=new Tank();
        tank=(Tank)line.assembleProduct(tank);
	}

}
