package handler;

public class Mobile {
	
	int imeiNo;
	String brand;
	int modelNo;
	String processor;
	String Owner;
	
	@Override
	public boolean equals(Object s) {
	Mobile x=(Mobile)s;
	if (this.imeiNo==x.imeiNo) {
		return true;
	}else {
		return false;
	}
	}
	

}
