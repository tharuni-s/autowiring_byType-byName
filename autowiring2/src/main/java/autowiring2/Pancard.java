package autowiring2;

public class Pancard {
	int panNumber;
	String panHolderName;
	public int getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(int panNumber) {
		this.panNumber = panNumber;
	}
	public String getPanHolderName() {
		return panHolderName;
	}
	public void setPanHolderName(String panHolderName) {
		this.panHolderName = panHolderName;
	}
	@Override
	public String toString() {
		return "Pancard [panNumber=" + panNumber + ", panHolderName=" + panHolderName + "]";
	}
	

}
