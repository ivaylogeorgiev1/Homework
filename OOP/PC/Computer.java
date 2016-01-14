package PC;

public class Computer {
	String model;
	int year;
	double price;

	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	Computer() {
		this.isNotebook = false;
		this.operationSystem = "WinXP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory,
			double freeMemory, String operationSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}

	int comparePrice(Computer c) {
		// zashto ni e da da wryshtame integer ?!?
		if (this.price > c.price) {
			System.out.println(this.model + " is more expensive than "
					+ c.model);
			return -1;
		}
		if (this.price == c.price) {
			System.out.println(this.model + " has equal price with " + c.model);
			return 0;
		}
		if (this.price < c.price) {
			System.out.println(this.model + " is cheaper than " + c.model);
			return 1;
		}
		return -1; // zashto reve, ako go nqma tozi red ?

	}

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
