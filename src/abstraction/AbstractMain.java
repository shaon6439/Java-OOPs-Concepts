package abstraction;

public class AbstractMain {

	public static void main(String[] args) {
		BankOfAmerica boa = new BankOfAmerica();
		boa.approval();
		boa.create_acct();
		
		CapitalOne c = new CapitalOne();
		c.approval();
		c.create_acct();
	}

}
