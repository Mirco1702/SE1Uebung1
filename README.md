# SE1Uebung1

## 1.1.1

## 1.1.3

### Was ist der Vorteil einer separaten Test-Klasse?
Die Klassen an sich sind bessere wartbar und man hat Logik und Test voneinander getrennt. Dadurch ist die Möglichkeit von Wiederverwendbarkeit eher gegeben.

### Was ist bei einem Blackbox-Test der Sinn von Äquivalenzklassen?
Dienen dazu um eine repräsentative Auswahl an Testfällen zu definieren um die Tests effizient zu halten. Beispielsweise durch Randbetrachtung der Testfälle um redundatne Testfälle zu minimieren. 

### Warum ist ein Blackbox-Test mit JUnit auf der Klasse Client nicht unmittelbar durchführbar?
Der Test arbeitet mit Rückgabewerten welche in der Client Klasse nicht vorhanden sind. Sie ist unteranderem für die Consolenausgabe zuständig was das Testen somit erschwert. 
