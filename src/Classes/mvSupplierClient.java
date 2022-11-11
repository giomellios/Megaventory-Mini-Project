package Classes;


public class mvSupplierClient extends Insertions<Object>{

	private String SupplierClientType;
	private String SupplierClientName;
	private String SupplierClientEmail;
	private String SupplierClientPhone1;
	private String SupplierClientShippingAddress1;

	
	public mvSupplierClient(String SCT,String SCN,String SCE,String SCP1,String SCSA) {
		this.setSupplierClientType(SCT);
		this.setSupplierClientEmail(SCE);
		this.setSupplierClientName(SCN);
		this.setSupplierClientPhone1(SCP1);
		this.setSupplierClientShippingAddress1(SCSA);
	}
	public String getSupplierClientType() {
		return SupplierClientType;
	}
	public void setSupplierClientType(String supplierClientType) {
		SupplierClientType = supplierClientType;
	}
	public String getSupplierClientName() {
		return SupplierClientName;
	}
	public void setSupplierClientName(String supplierClientName) {
		SupplierClientName = supplierClientName;
	}
	public String getSupplierClientEmail() {
		return SupplierClientEmail;
	}
	public void setSupplierClientEmail(String supplierClientEmail) {
		SupplierClientEmail = supplierClientEmail;
	}
	public String getSupplierClientPhone1() {
		return SupplierClientPhone1;
	}
	public void setSupplierClientPhone1(String supplierClientPhone1) {
		SupplierClientPhone1 = supplierClientPhone1;
	}
	public void setSupplierClientShippingAddress1(String supplierClientShippingAddress) {
		SupplierClientShippingAddress1=supplierClientShippingAddress;
	}
	public String getSupplierClientShippingAddress1() {
		return SupplierClientShippingAddress1;
	}
	
}
