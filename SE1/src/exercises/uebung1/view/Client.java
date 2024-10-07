package exercises.uebung1.view;

import exercises.uebung1.control.Fabrik;

public class Client {
	
	private Fabrik germTemp;

		/**
		 * Methode zur Ausgabe einer Zahl auf der Console
		 * (auch bezeichnet als CLI, Terminal)
		 *
		 */
		 void display( int aNumber ){
			// In dieser Methode soll die Methode translateNumber
			// mit dem übergegebenen Wert der Variable aNumber
			// aufgerufen werden.
			//
			// Strenge Implementierung (nur) gegen das Interface Translator gewuenscht!
			 
			 germTemp.createGermanTranslator().translateNumber(aNumber);

			 System.out.println("Das Ergebnis der Berechnung: " +
					 germTemp.createGermanTranslator().translateNumber(aNumber) );

		 }
}




