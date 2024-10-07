package exercises.uebung1.control;

public class Fabrik {
	
	public Translator createGermanTranslator() {
		GermanTranslator x = new GermanTranslator();
		x.setDate("date");
		return x;
	}
}
