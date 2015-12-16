package PC;
public class Computer {
	String model;
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

	void changeOperationSystem(String os) {
		this.operationSystem = os;
	}

	void useMemory(int a) {
		if (this.freeMemory < a) {
			System.out.println(this.model + " has not enough moemory");
		} else
			this.freeMemory -= a;

	}

	void pcPower() {
		System.out.println("-Model " + this.model + " -Free Memory "
				+ this.freeMemory + " -Hard Disk Memory " + this.hardDiskMemory
				+ " -Notebook? " + this.isNotebook + " -Operation System "
				+ this.operationSystem + " -year " + this.year
				+ " -price in lv " + this.price);
	}

}
