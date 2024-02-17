package encapsulation;

public class Facebook {

	public String name = "John"; //everyone can see
	protected int age =25;    //myself, friends & friends of friends 
	private String phNumber="111"; //only myself
	String collageNmae = "ABC"; //myself & my friends
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	
	
}
