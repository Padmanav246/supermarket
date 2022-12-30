package mart.supermarket;
public class Products 
{
	private int productid;
	private String producttype;
	private String productdescription;
	private int numberofproduct;
	private double price;


	

	public Products(int productid, String producttype, String productdescription, int numberofproduct, double price)
	{
		
		this.productid = productid;
		this.producttype = producttype;
		this.productdescription = productdescription;
		this.numberofproduct = numberofproduct;
		this.price = price;
	}

	public String getProducttype() {
		return producttype;
	}

	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	public String getProductdescription() {
		return productdescription;
	}

	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	public int getNumberofproduct() {
		return numberofproduct;
	}

	public void setNumberofproduct(int numberofproduct) {
		this.numberofproduct = numberofproduct;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	@Override
	public String toString() {
		return "[productid=" + productid + ", producttype=" + producttype + ", productdescription="
				+ productdescription + ", numberofproduct=" + numberofproduct + ", price=" + price + "]";
	}
	
}
