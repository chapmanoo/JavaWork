
public class CD extends Item{

	private String artist;
	private int numberOfTracks;
	
	public CD(String itemName, String typeOfItem,
			boolean isCheckedOut, String artist, int numberOfTracks) {
		super(itemName, "CD", isCheckedOut);
		this.artist = artist;
		this.numberOfTracks = numberOfTracks;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}

}