import java.util.LinkedList;

public class LibraryFunctions {
	private LinkedList<Item> itemList = new LinkedList<Item>();
	private LinkedList<People> userList = new LinkedList<People>();

	public void checkOutItem(Item item) {
		if(item.isCheckedOut()) {
			System.out.println("Item is already checked out");
		} else {
			item.setCheckedOut(true);
			System.out.println("Item: " + item.getItemName() + ", has been checked out");
		}
	}
	
	public void checkInItem(Item item) {
		if(!item.isCheckedOut()) {
			System.out.println("Item is already checked in");
		} else {
			item.setCheckedOut(false);
			System.out.println("Item: " + item.getItemName() + ", has been checked in");
		}
	}
	
	public void findItem(Item item) {
		for (Item i : itemList)
		{
			if (i.getItemName().equals(item.getItemName()))
			{
				System.out.println("You found " + item.getItemName());
				return;
			} 
		}
		System.out.println("Item not found");
	}
	
	public void addItem(Item item) {
		itemList.add(item);
	}
	
	public void removeItem(Item item) {
		itemList.remove(item);
		
		System.out.println(item.getItemName() + " has been removed.");
	}
	
	public void updateItem(Item itemOrigin, Item itemNew) {
		//Item tmpItem = new Item(itemNew);
		//return tmpItem;
		//itemOrigin = itemNew;
		itemOrigin.setItemName(itemNew.getItemName());
		itemOrigin.setTypeOfItem(itemNew.getTypeOfItem());
		itemOrigin.setCheckedOut(itemNew.isCheckedOut());
		
		//itemOrigin.get
	}
	
	public void registerUser(People newUser) {
		userList.add(newUser);
	}
	
	public void deleteUser(People userToRemove) {
		userList.remove(userToRemove);
	}
	
	public void updateUser(People originalUser, People updatedUser) {
		originalUser = updatedUser;
	}
	
	
}
