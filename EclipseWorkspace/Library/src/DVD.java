
public class DVD extends Item{

	private int runtime;
	private String genre;
	
	public DVD(String itemName, String typeOfItem,
			boolean isCheckedOut, int runtime, String genre) {
		super(itemName, "DVD", isCheckedOut);
		this.runtime = runtime;
		this.genre = genre;
		
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
