package Classes;


public class mvTax extends Insertions<Object>{

	private String TaxName;
	private String TaxDescription;
	private String TaxValue;
	
	public mvTax(String TaxName,String TaxDescription,String TaxValue) {
		this.setTaxDescription(TaxDescription);
		this.setTaxName(TaxName);
		this.setTaxValue(TaxValue);
	}
	
	public String getTaxName() {
		return TaxName;
	}
	public void setTaxName(String taxName) {
		TaxName = taxName;
	}
	public String getTaxDescription() {
		return TaxDescription;
	}
	public void setTaxDescription(String taxDescription) {
		TaxDescription = taxDescription;
	}
	public String getTaxValue() {
		return TaxValue;
	}
	public void setTaxValue(String taxValue) {
		TaxValue = taxValue;
	}
}
