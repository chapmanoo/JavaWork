
public class LibraryRunner {

	public static void main(String[] args) {

		LibraryFunctions lf = new LibraryFunctions();

		Book b1 = new Book("Call of Cthulu", "Book", false, "H.P. Lovecraft", 25);
		Book b2 = new Book("Call of Cthulu2", "Book", false, "H.P. Lovecraft2", 251);
		Book b3 = new Book("Call of Cthulu3", "Book", false, "H.P. Lovecraft3", 252);

		DVD dvd1 = new DVD("Frozen", "DVD", true, 71, "Kids");
		DVD dvd2 = new DVD("Lord of the Rings: The Two Towers", "DVD", false, 133, "Fantasy");
		DVD dvd3 = new DVD("Final Destination", "DVD", true, 85, "Horror");
		DVD dvd4 = new DVD("Hot Fuzz", "DVD", false, 92, "Comedy");

		lf.addItem(b1); // .addItem seems to be working
		lf.addItem(b2);
		lf.addItem(b3);

		// System.out.println(b3.getAuthor()); // .getAuthor seems to be working

		lf.addItem(dvd1); // seems to be working
		lf.addItem(dvd2);
		lf.addItem(dvd3);
		lf.addItem(dvd4);

		// System.out.println(dvd4.getRuntime()); //.getRuntime seems to be working

		// lf.updateItem(dvd4, dvd2); //needs fixing, can only alter variables Item can
		// access
		// System.out.println(dvd4.getRuntime());
		
		lf.findItem(dvd2);
		lf.removeItem(dvd2);
		lf.findItem(dvd2); // find and remove works, item has been removed from the list

		// lf.checkOutItem(dvd2); //.checkOut seems to be working
		// lf.checkInItem(dvd2); // .checkIn seems to be working

		User user1 = new User("00001", "UserName One");
		User user2 = new User("00002", "UserName Two");
		User user3 = new User("00003", "UserName Three");
		User user4 = new User("00004", "UserName Four");

		lf.registerUser(user1);
		lf.registerUser(user2);
		lf.registerUser(user3);
		lf.registerUser(user4);

	}
}
