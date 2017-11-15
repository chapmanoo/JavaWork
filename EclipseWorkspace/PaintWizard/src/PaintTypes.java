
public class PaintTypes {

	private String name;
	private int size;
	private double price;
	private int coverage; // in m^2
	private int wastedPaint;
	private double totalPrice;

	public PaintTypes(String name, int size, double price, int coverage) {
		this.name = name;
		this.size = size;
		this.price = price;
		this.coverage = coverage; // in m^2
		this.wastedPaint = 0;
		this.totalPrice = 0;
	}

	final public String getName() {
		return this.name;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}

	final public int getSize() {
		return this.size;
	}
	
	public void setSize(int newSize)
	{
		this.size = newSize;
	}
	
	final public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	
	final public int getCoverage() {
		return this.coverage;
	}
	
	public void setCoverage(int potSize, int coveragePerLitre) {
		this.coverage = potSize * coveragePerLitre;
	}
	
	public int getWastedPaint( ) {
		return this.wastedPaint;
	}
	
	public void setWastedPaint(int newWastedPaint) {
		this.wastedPaint = newWastedPaint;
	}
	
	public double getTotalPrice( ) {
		return this.totalPrice;
	}
	
	public void setTotalPrice(double newTotalPrice) {
		this.totalPrice = newTotalPrice;
	}
}
