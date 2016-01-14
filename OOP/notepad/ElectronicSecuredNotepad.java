package notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements
		IElectronicDevice {

	private boolean isStarter = false;

	public ElectronicSecuredNotepad(int numberOfPages, String password) {
		super(numberOfPages, password);
	}

	@Override
	public void start() {
		isStarter = true;
		System.out.println("The device is started");
	}

	@Override
	public void stop() {
		isStarter = false;
		System.out.println("The device is stopped");
	}

	@Override
	public boolean isStarted() {
		if (isStarter) {
			System.out.println("The device is started!");
			return true;
		} else {
			System.out.println("The device is not started!");
			return false;
		}
	}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if (isStarter) {
			super.addTextToPage(text, pageNumber);
		} else {
			System.out.println("The device is not started!");

		}
	}

	@Override
	public void rewritePage(String text, int pageNumber) {
		if (isStarter) {
			super.rewritePage(text, pageNumber);
		} else {
			System.out.println("The device is not started!");

		}
	}

	@Override
	public void deleteTextPage(int pageNumber) {
		if (isStarter) {
			super.deleteTextPage(pageNumber);
		} else {
			System.out.println("The device is not started!");

		}
	}

	@Override
	public void printPages() {
		if (isStarter) {
			super.printPages();
		} else {
			System.out.println("The device is not started!");
		}
	}

	@Override
	public void searchWord(String word) {
		if (isStarter) {
			super.searchWord(word);
		} else {
			System.out.println("The device is not started!");
		}

	}

	@Override
	public void printAllPagesWithDigits() {
		if (isStarter) {
			super.printAllPagesWithDigits();
		} else {
			System.out.println("The device is not started!");
		}

	}

}
