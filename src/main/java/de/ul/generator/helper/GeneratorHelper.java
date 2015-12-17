package de.ul.generator.helper;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

public class GeneratorHelper {
	public static String getFQN(Package p) {
		String name = p.getName();
		
		Element child = p.getOwnedElements().get(0);
		
		while(child instanceof Package) {
			name += "." + ((Package)child).getName();
			child = child.getOwnedElements().get(0);
		}
		
		return "project --topLevelPackage " + name;
	}
}
