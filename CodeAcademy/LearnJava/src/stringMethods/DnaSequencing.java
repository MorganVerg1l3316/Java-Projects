package testing;

public class DnaSequencing {
	public static void main(String[] args) {
	    String dna1 = "ATGCGATACGCTTGA";
	    String dna2 = "ATGCGATACGTGA";
	    String dna3 = "ATTAATATGTACTGA";

	    String dna = dna3;

	    int Length = dna.length();

	    int startCodon = dna.indexOf("ATG");
	    int stopCodon = dna.indexOf("TGA");
	    
	    if (startCodon != -1 && stopCodon != -1 && (stopCodon - startCodon) % 3 == 0) {
	      System.out.println("Protein");
	    } else {
	      System.out.println("No protein");
	    }
	  }
}
