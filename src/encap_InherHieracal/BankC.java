package encap_InherHieracal;

public class BankC extends BankA{
private int acctNumber=123;
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
