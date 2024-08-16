public class Bit {
	private int value;
	public Bit(){
		value = 0 ;
	}
	
	public void setBit(int a) {
		if(a == 1 || a == 0) {
			value = a;
		}
	}
	
	public int getBit() {
		return value;
	}
	
	
}
