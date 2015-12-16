package PC;
public class CompObjects {
	public static void main(String[] args) {
		Computer hp = new Computer();
		hp.model = "HP";
		hp.freeMemory = 512;
		hp.hardDiskMemory = 320;
		hp.operationSystem = "Windows";
		hp.year = 2011;
		hp.price = 1000;
		hp.isNotebook = true;
		Computer dell = new Computer();
		dell.model = "Dell";
		dell.freeMemory = 1024;
		dell.hardDiskMemory = 640;
		dell.isNotebook = false;
		dell.year = 2010;
		dell.price = 800;
		dell.operationSystem = "Linux";
		dell.useMemory(100);
		hp.changeOperationSystem("Mac");
		hp.pcPower();
		dell.pcPower();
	}
}
