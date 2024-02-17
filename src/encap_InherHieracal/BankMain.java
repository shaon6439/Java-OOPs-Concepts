package encap_InherHieracal;

public class BankMain {

	public static void main(String[] args) {
		BankB b = new BankB();
		b.create();
		b.approval();
		System.out.println(b.getAcctNumber());
		
		BankC c = new BankC();
		c.approval();
		c.create();
		System.out.println(c.getAcctNumber());
	}

}
