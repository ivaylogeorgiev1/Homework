package notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	private String password;

	public SecuredNotepad(int numberOfPages, String password) {
		super(numberOfPages);

		boolean hasFiveSymbols = false;
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasDigit = false;
		if (password.length() >= 5) {
			hasFiveSymbols = true;
		}
		for (int i = 'a'; i < 'z'; i++) {
			for (int j = 0; j < password.length(); j++) {
				if (password.charAt(j) == i) {
					hasLowerCase = true;
					break;
				}
			}
		}
		for (int i = 'A'; i < 'Z'; i++) {
			for (int j = 0; j < password.length(); j++) {
				if (password.charAt(j) == i) {
					hasUpperCase = true;
					break;
				}
			}
		}
		for (int i = '0'; i < '9'; i++) {
			for (int j = 0; j < password.length(); j++) {
				if (password.charAt(j) == i) {
					hasDigit = true;
					break;
				}
			}
		}
		if (hasDigit && hasFiveSymbols && hasLowerCase && hasUpperCase) {
			this.password = password;
		} else {
			throw new IllegalArgumentException(
					"You have to create strong password!");
		}
	}

	private boolean checkPassword() {
		String password;

		System.out.println("Please enter password: ");
		password = new Scanner(System.in).next();
		if (this.password.equals(password)) {
			return true;
		} else {
			System.out.println("Wrong password");
			return false;
		}
	}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if (checkPassword()) {
			super.addTextToPage(text, pageNumber);
		}
	}

	@Override
	public void rewritePage(String text, int pageNumber) {
		if (checkPassword()) {
			super.rewritePage(text, pageNumber);
		}
	}

	@Override
	public void deleteTextPage(int pageNumber) {
		if (checkPassword()) {
			super.deleteTextPage(pageNumber);
		}

	}

	@Override
	public void printPages() {
		if (checkPassword()) {
			super.printPages();
		}
	}

	@Override
	public void searchWord(String word) {
		if (checkPassword()) {
			super.searchWord(word);
		}
	}

	@Override
	public void printAllPagesWithDigits() {

		if (checkPassword()) {
			super.printAllPagesWithDigits();
		}
	}

	@Override
	public void setHeader(String header, int pageNumber) {
		if (checkPassword()) {
			super.setHeader(header, pageNumber);
		}
	}

}
