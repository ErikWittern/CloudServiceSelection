package edu.kit.cockpit.sfmdesigner.analyzer.domain.java;

public enum VariabilityDependencyType {

	MANDATORY 	("Mandatory  ", "--*"),
	OPTIONAL 	("Optional   ", "--o"),
	OR 			("Or         ", "<| "),
	XOR 		("Xor        ", "<<|"),
	REQUIRES	("Requires   ", "-->"),
	EXCLUDES	("Excludes   ", "<->"),
	CARDINALITY	("Cardinality", "n/m"),
	ATTRIBUTE	("Attribute  ", "|--"),
	CUSTOM		("Custom     ", " ? ");
	
	private final String label;
    private final String symbol;
    
    VariabilityDependencyType(String label, String symbol) {
        this.label = label;
        this.symbol = symbol;
    }
    String getLabel()  { return label; }
    String getSymbol() { return symbol; }

}
