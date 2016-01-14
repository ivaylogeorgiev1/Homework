package notepad;

public class NotepadDemo {
	public static void main(String[] args) {
		// SecuredNotepad keyPad = new SecuredNotepad(10, 123);
		// keyPad.addTextToPage("Samo levski ale ale ale!", 2);
		// keyPad.addTextToPage(
		// "In 2005, he was forced to call a halt to his involvement in a training camp with former club Sevilla because of homesickness, only 100 kilometres from his home city. A decade later and much further from the sunny Andalusia, on a grey afternoon in Warrington as he speaks to FourFourTwo, Navas is just fine.",
		// 3);
		// keyPad.printAllPagesWithDigits();

		// INotepad b = new ElectronicSecuredNotepad(4, 123);

		ElectronicSecuredNotepad elPad = new ElectronicSecuredNotepad(23,
				"32Aa1");
		elPad.start();
		// elPad.addTextToPage("Uraa", 23);
		// elPad.printPages();
		// elPad.deleteTextPage(23);
		// elPad.addTextToPage("2", 0);
		// elPad.printAllPagesWithDigits();

		elPad.setHeader("DA", 1);
		elPad.addTextToPage("asaaad", 1);
		elPad.printPages();

	}
}
