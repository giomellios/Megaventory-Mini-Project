package Classes;

public class mvSalesOrder extends Insertions<Object>{

	private String SalesOrderStatus;
	private String SalesOrderClientName;
	private String SalesOrderShippingAddress;
	private String SalesOrderAmountTotalDiscount;
	private String SalesOrderTotalTax;
	
	public mvSalesOrder(String orderStatus,mvSupplierClient sc,mvDiscount d,mvTax t) {
		this.setSalesOrderStatus(orderStatus);
		this.setSalesOrderClientName(sc.getSupplierClientName());
		this.setSalesOrderShippingAddress(sc.getSupplierClientShippingAddress1());
		this.setSalesOrderAmountTotalDiscount(d.getDiscountValue());
		this.setSalesOrderTotalTax(t.getTaxValue());
	}
	
	public String getSalesOrderStatus() {
		return SalesOrderStatus;
	}

	public void setSalesOrderStatus(String salesOrderStatus) {
		SalesOrderStatus = salesOrderStatus;
	}

	public String getSalesOrderClientName() {
		return SalesOrderClientName;
	}

	public void setSalesOrderClientName(String salesOrderClientName) {
		SalesOrderClientName = salesOrderClientName;
	}

	public String getSalesOrderShippingAddress() {
		return SalesOrderShippingAddress;
	}

	public void setSalesOrderShippingAddress(String salesOrderShippingAddress) {
		SalesOrderShippingAddress = salesOrderShippingAddress;
	}

	public String getSalesOrderAmountTotalDiscount() {
		return SalesOrderAmountTotalDiscount;
	}

	public void setSalesOrderAmountTotalDiscount(String salesOrderAmountTotalDiscount) {
		SalesOrderAmountTotalDiscount = salesOrderAmountTotalDiscount;
	}

	public String getSalesOrderTotalTax() {
		return SalesOrderTotalTax;
	}

	public void setSalesOrderTotalTax(String salesOrderTotalTax) {
		SalesOrderTotalTax = salesOrderTotalTax;
	}
}
