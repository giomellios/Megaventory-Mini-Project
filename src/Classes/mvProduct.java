package Classes;



public class mvProduct extends Insertions<Object>{

	private String ProductSKU;
	private String ProductDescription;
	private String ProductSellingPrice;
	private String ProductPurchasePrice;
	
	public mvProduct(String SKU,String description,String salesPrice,String purchasePrice) {
		this.setProductSKU(SKU);
		this.setProductDescription(description);
		this.setProductSellingPrice(salesPrice);
		this.setProductPurchasePrice(purchasePrice);
	}
	
	
	public String getProductSKU() {
		return ProductSKU;
	}


	public void setProductSKU(String ProductSKU) {
		this.ProductSKU = ProductSKU;
	}


	public String getProductDescription() {
		return ProductDescription;
	}


	public void setProductDescription(String ProductDescription) {
		this.ProductDescription = ProductDescription;
	}


	public String getProductSellingPrice() {
		return ProductSellingPrice;
	}


	public void setProductSellingPrice(String productSellingPrice) {
		this.ProductSellingPrice = productSellingPrice;
	}


	public String getProductPurchasePrice() {
		return ProductPurchasePrice;
	}


	public void setProductPurchasePrice(String productPurchasePrice) {
		this.ProductPurchasePrice = productPurchasePrice;
	}	
}
