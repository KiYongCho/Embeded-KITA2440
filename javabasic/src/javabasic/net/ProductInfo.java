package javabasic.net;

public class ProductInfo {

	private String prodName;
	private int prodPrice;
	private int prodPoint;

	public ProductInfo(String prodName, int prodPrice, int prodPoint) {
		super();
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodPoint = prodPoint;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

	public int getProdPoint() {
		return prodPoint;
	}

	public void setProdPoint(int prodPoint) {
		this.prodPoint = prodPoint;
	}

	@Override
	public String toString() {
		return "ProductInfo [prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodPoint=" + prodPoint + "]";
	}

}
