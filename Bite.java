public class Bite {
	public Bit[] value = new Bit[8];
	
	public Bite() {
		for(int i = 0; i < 8; i++) {
			value[i] = new Bit();
		}
	}
	
	public void setBite(int k) {
		
		for(int i = 0; i < 8; i++) {
			if(Math.pow(2, 7-i) <= k) {
				value[i].setBit(1);
				k -= Math.pow(2, 7-i);
			}
		}
	}
	
	
	
	public String getStringBite() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(Integer.toString(value[i].getBit()));
		}
		
		return sb.toString();
	}
	
	
	public int getByteD() {
		int res = 0;
		for (int i = 7; i > -1; i--) {
			if (value[i].getBit() == 1) {
				res += Math.pow(2, 7-i);
			}
		}
		
		return res;
	}
		
}
