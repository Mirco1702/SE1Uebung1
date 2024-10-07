# SE1Uebung1

## 1.1.1

### Wie kann diese Kommunikationsverbindung nun dennoch mit Hilfe einer zusätzlichen „Fabrik“-Klasse, welche die dazu notwendige Objekt-Erzeugung übernimmt, aufgebaut werden?
Siehe Code unter https://github.com/Mirco1702/SE1Uebung1/tree/main/SE1/src/exercises/uebung1

### In welchem Package sollte diese zusätzliche Klasse liegen?
In Control, siehe Code

### Welches Entwurfsmuster (engl.: design pattern) könnte für die Problematik der Objekt-Erzeugung verwendet werden? Was ist der software-technische Nutzen bei der Verwendung des Entwurfsmusters?
Das Factory Method Pattern ermöglicht es, neue Translator-Implementierungen hinzuzufügen, ohne den Code des Clients anpassen zu müssen. Alternativ könnte man das Konzept auch durch ein Factory-Interface umsetzen. Dadurch kann bereits bei der Erstellung des Client-Objekts entschieden werden, welche Factory-Implementierung verwendet wird, wie z.B. eine GermanTranslatorFactory oder MagyarTranslatorFactory. In diesem Fall wäre es nicht nötig, die Methode im Client bei einer Erweiterung anzupassen, da das Factory-Interface die Methode createTranslator() vorschreibt. Jede neue Implementierung würde somit diese Methode enthalten.

### Wie muss man den Source Code des Interface ggf. anpassen, um mögliche auftretende Kompilierfehler zu beseitigen?
Durch das public machen des Interfaces kann die Client-Klasse mit den Translator-Objekten arbeiten und es käme so zu keinen Kompilierfehlern in diesem Bereich. 

## 1.1.3

### Was ist der Vorteil einer separaten Test-Klasse?
Die Klassen an sich sind bessere wartbar und man hat Logik und Test voneinander getrennt. Dadurch ist die Möglichkeit von Wiederverwendbarkeit eher gegeben.

### Was ist bei einem Blackbox-Test der Sinn von Äquivalenzklassen?
Dienen dazu um eine repräsentative Auswahl an Testfällen zu definieren um die Tests effizient zu halten. Beispielsweise durch Randbetrachtung der Testfälle um redundatne Testfälle zu minimieren. 

### Warum ist ein Blackbox-Test mit JUnit auf der Klasse Client nicht unmittelbar durchführbar?
Der Test arbeitet mit Rückgabewerten welche in der Client Klasse nicht vorhanden sind. Sie ist unteranderem für die Consolenausgabe zuständig was das Testen somit erschwert. 
