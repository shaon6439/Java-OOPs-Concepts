package encap_InherHieracal;

public class BankB extends BankA{
	private int acctNumber=456;
	void create() {
		System.out.println("B created");
	}
	public int getAcctNumber() {
		return acctNumber;
	}
	public void setAcctNumber(int acctNumber) {
		this.acctNumber = acctNumber;
	}
}
