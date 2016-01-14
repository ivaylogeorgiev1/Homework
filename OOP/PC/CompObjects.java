package PC;

public class CompObjects {
	public static void main(String[] args) {
		Computer hp = new Computer();
		Computer acer = new Computer();
		Computer sony = new Computer(1999, 20, true, 80, 512, "WinXp");
		Computer apple = new Computer(2015, 3500, 1000, 4096);
		apple.model = "Apple";
		apple.isNotebook = true;
		acer.model = "Acer";
		acer.price = 834.4;
		sony.model = "Sony";
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
		dell.price = 1000;
		dell.operationSystem = "Linux";
		dell.useMemory(100);
		hp.changeOperationSystem("Mac");
		hp.pcPower();
		dell.pcPower();
		acer.pcPower();
		apple.pcPower();
		sony.pcPower();
		// bez syso nqma da imame integer w rezultata, no zashto ni e da pravim
		// metod koito wryshta integer za towa sravnenie?.. malko bezsmisleno...
		// :D
		System.out.println(apple.comparePrice(hp));
		System.out.println(dell.comparePrice(hp));
		System.out.println(acer.comparePrice(hp));
	}
}
