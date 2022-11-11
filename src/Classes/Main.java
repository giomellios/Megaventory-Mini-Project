package Classes;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		mvProduct p=new mvProduct("1112256","Nike Shoes","99.99", "44.99");
		mvSupplierClient c=new mvSupplierClient("Client", "babis", "babis@exampletest.com","1235698967", "Example 8, Athens");
		mvInventoryLocation iL=new mvInventoryLocation("Test", "Test Project Location","Example 20,Athens");
		mvTax t=new mvTax("VAT", "VAT GR", "24");
		mvDiscount d=new mvDiscount("Loyalty","Loyalty Customer Discount", "50");
		
		String sp=p.toJSON(p);
		String sc=c.toJSON(c);
		String cil=iL.toJSON(iL);
		String st=t.toJSON(t);
		String sd=d.toJSON(d);
		
		/*System.out.println(sp);
		System.out.println(sc);
		System.out.println(cil); 	THOSE PRINTS ARE FOR TESTING
		System.out.println(st);
		System.out.println(sd);*/
		
		
		p.Request("https://api.megaventory.com/v2017a/Product/ProductUpdate", sp);
		c.Request("https://api.megaventory.com/v2017a/SupplierClient/SupplierClientUpdate", sc);
		iL.Request("https://api.megaventory.com/v2017a/InventoryLocation/InventoryLocationUpdate", cil);
		t.Request("https://api.megaventory.com/v2017a/Tax/TaxUpdate", st);
		d.Request("https://api.megaventory.com/v2017a/Discount/DiscountUpdate", sd);
		
		mvSalesOrder so=new mvSalesOrder("Pending", c, d, t);
		
		String sso=so.toJSON(so);
		so.Request("https://api.megaventory.com/v2017a/SalesOrder/SalesOrderUpdate", sso);
	}
}
