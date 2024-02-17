package abstraction;

public abstract class Federal {
	//abstract method will not have implementation
	//define abstract method only with abstract keyword
	//if in a class if one method is abstract, then the class is also abstract
	
	abstract void create_acct();
	void approval(){
		System.out.println("Approved");
	}
}
