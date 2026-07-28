package testing;

public class Language {
	protected String name;
	  protected int numSpeakers;
	  protected String regionsSpoken;
	  protected String wordOrder;

	  public Language(String langName, int speakers, String regions, String wdOrder) {
	    this.name = langName;
	    this.numSpeakers = speakers;
	    this.regionsSpoken = regions;
	    this.wordOrder = wdOrder;
	  }
	  public static void main(String[] args) {
	    Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");

	    Mayan kiche = new Mayan("Ki'che'", 2330000);
	    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
	    SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);

	    spanish.getInfo();
	    kiche.getInfo();
	    mandarin.getInfo();
	    burmese.getInfo();
	  }

	  public void getInfo() {
	    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". The language follows the word order: " + wordOrder);
	  }
}
