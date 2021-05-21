package hash;

public class Hashing {

	private int x,y,z;
	public static final int table_size=13;

	public Hashing() {
		x=y=z=0;
	}

	public int getHash() {
		int n= (z*100)+(y*10)+(x);
		return n%table_size;
	}
	
	public int getHash1() {
		int n= Integer.parseInt(String.valueOf(z)+String.valueOf(y)+String.valueOf(x));
		return n%table_size;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
}
