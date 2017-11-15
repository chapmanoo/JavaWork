
public class Book extends Item{

	private String author;
	private int numberOfPages;
	
	public Book(String itemName, String typeOfItem, 
			boolean isCheckedOut, String author, int numberOfPages) {
		super(itemName, "Book", isCheckedOut);
		this.author = author;
		this.numberOfPages = numberOfPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	public String getTypeOfItem() {
		return "Book";
	}

}
