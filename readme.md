# Generierung einer Spring Roo Anwendung aus UML

Im Rahmen des Seminars "Software aus Komponenten" entstand dieser Prototyp eines Model2Text-Generators.

## Nutzung

### Voraussetzungen

- Eclipse 4.5.1 (Mars)
- Spring Roo 1.3.2

### Pet Clinic Beispiel

- roo script /path/to/project.txt

### beliebiges UML-Diagramm

- Papyrus Datei in Eclipse laden
- Run As -> generate
- roo script /path/to/generated.txt

## Dokumentation

- Präsentation.pdf
- in Dateien:
	- main.xpt
	- cmd.ext
	- GeneratorHelper.java

## Umgesetze Roo-Befehle mit Argumenten

| Befehle | Argumente |  |  |  |
| --- | --- | --- | --- | --- | --- |
| class   | class | abstract | extends |
| classJPA   | class | abstract | extends || constructor | class | | equals | class | | enum contant | name | | enum type | class | | field | type | fieldName | class | notNull || entity jpa | class | | jpa setup | database | provider || json | all | add | class || project | toplevelpackage | projectname |
| web mvc setup |
| web mvc finder | all |
| finder add | class | finderName |
| finder list | class | filter |
