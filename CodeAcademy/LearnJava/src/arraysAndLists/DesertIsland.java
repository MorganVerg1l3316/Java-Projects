package testing;
import java.util.Arrays;
import java.util.ArrayList;

public class DesertIsland {
	public static void main(String[] args) {
	    String[] favouriteSongs = {"Song1", "Song2", "Song3", "Song4", "Song5", "Song6", "Song7", "Song8", "Song9", "Song10"};

	    for (int i = 0; i < 3; i++) {
	      System.out.println(favouriteSongs[i]);
	    }

	    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

	    desertIslandPlaylist.addAll(Arrays.asList(favouriteSongs));

	    System.out.println(desertIslandPlaylist);
	  }
}
