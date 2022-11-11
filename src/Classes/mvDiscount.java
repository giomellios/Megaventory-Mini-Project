package Classes;


public class mvDiscount extends Insertions<Object>{
	
	private String DiscountName;
	private String DiscountDescription;
	private String DiscountValue;
	
	public mvDiscount(String DiscountName,String DiscountDesc,String DiscountVal){
		this.setDiscountDescription(DiscountDesc);
		this.setDiscountName(DiscountName);
		this.setDiscountValue(DiscountVal);
		
	}
	
	
	public String getDiscountName() {
		return DiscountName;
	}
	public void setDiscountName(String discountName) {
		DiscountName = discountName;
	}
	public String getDiscountDescription() {
		return DiscountDescription;
	}
	public void setDiscountDescription(String discountDescription) {
		DiscountDescription = discountDescription;
	}
	public String getDiscountValue() {
		return DiscountValue;
	}
	public void setDiscountValue(String discountValue) {
		DiscountValue = discountValue;
	}	
}
