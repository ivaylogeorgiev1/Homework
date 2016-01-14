package notepad;

public class SimpleNotepad implements INotepad {
	private final Page[] pages;

	SimpleNotepad(int numberOfPages) {
		pages = new Page[numberOfPages + 1];
		// +1 potrebitelqt da ne wywejda idndex na stranica, a nomera na samata
		// stranica.
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Page();
		}
	}

	public void setHeader(String header, int pageNumber) {
		if (pageNumber <= this.pages.length && pageNumber > 0) {
			this.pages[pageNumber].setHeader(header);
		} else {
			System.out.println("There is no page number " + pageNumber);
		}
	}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if (pageNumber < this.pages.length && pageNumber > 0) {
			this.pages[pageNumber].addText(text);
		} else {
			System.out.println("There is no page number " + pageNumber);
		}
	}

	@Override
	public void rewritePage(String text, int pageNumber) {
		if (pageNumber < this.pages.length && pageNumber > 0) {
			this.pages[pageNumber].deleteText();
			this.addTextToPage(text, pageNumber);
		} else {
			System.out.println("There is no page number " + pageNumber);
		}
	}

	@Override
	public void deleteTextPage(int pageNumber) {
		if (pageNumber < this.pages.length && pageNumber > 0) {
			this.pages[pageNumber].deleteText();
		} else {
			System.out.println("There is no page number " + pageNumber);
		}

	}

	@Override
	public void printPages() {
		for (int i = 1; i < this.pages.length; i++) {
			System.out.println(this.pages[i].printPage());
			System.out.println("Page " + (i));
		}

	}

	@Override
	public void searchWord(String word) {
		boolean containsWord = false;
		System.out.println("Searching for word " + word + " ...");
		for (int i = 1; i < this.pages.length; i++) {
			if (this.pages[i].searchWord(word)) {
				System.out.println("Page " + i + " contains the word " + word
						+ " ");
				containsWord = true;
			}
		}
		if (!containsWord) {
			System.out.println("The pages of the  doesnt contains the word"
					+ word);

		}
	}

	@Override
	public void printAllPagesWithDigits() {
		boolean containsDigit = false;
		System.out.println("Pringing all the pages that has digits...");
		for (int i = 1; i < this.pages.length; i++) {
			if (this.pages[i].containsDigits()) {
				System.out.println(this.pages[i].printPage());
				containsDigit = true;
			}
		}
		if (!containsDigit) {
			System.out.println("There is no page that cointains digit");

		}
	}
}
