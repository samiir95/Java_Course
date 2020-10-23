package chapter11;

public interface Product {

	void setPrice(double price);
	double getPrice();
	
	void setName(String name);
	String getName();
	
	void setColor(String color);
	String getColor();
	
	default String getBarCode()
	{
		return "no barcode!";
	}
}
