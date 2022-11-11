package Classes;


public class mvInventoryLocation extends Insertions<Object>{
	private String InventoryLocationAbbreviation;
	private String InventoryLocationName;
	private String InventoryLocationAddress;
	
	public mvInventoryLocation(String InventoryLocationAbb,String InventoryLocationName,String InventoryLocationAddress) {
		
		this.setInventoryLocationAbbreviation(InventoryLocationAbb);
		this.setInventoryLocationAddress(InventoryLocationAddress);
		this.setInventoryLocationName(InventoryLocationName);
	}
	
	
	public String getInventoryLocationAbbreviation() {
		return InventoryLocationAbbreviation;
	}

	public void setInventoryLocationAbbreviation(String inventoryLocationAbbreviation) {
		InventoryLocationAbbreviation = inventoryLocationAbbreviation;
	}

	public String getInventoryLocationName() {
		return InventoryLocationName;
	}

	public void setInventoryLocationName(String inventoryLocationName) {
		InventoryLocationName = inventoryLocationName;
	}

	public String getInventoryLocationAddress() {
		return InventoryLocationAddress;
	}

	public void setInventoryLocationAddress(String inventoryLocationAddress) {
		InventoryLocationAddress = inventoryLocationAddress;
	}
	
	
	
	
	
	
}
