package chapter4;

//Ryan
//Triangle object for proj2

public class ryanTriangle {
	private double l1;
	private double l2;
	private double l3;
	public ryanTriangle(){
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}
	public double getL1() {
		return l1;
	}
	public void setL1(double l1) {
		this.l1 = l1;
	}
	public double getL2() {
		return l2;
	}
	public void setL2(double l2) {
		this.l2 = l2;
	}
	public double getL3() {
		return l3;
	}
	public void setL3(double l3) {
		this.l3 = l3;
	}
	public boolean isRight(){
		double leg1;
		double leg2;
		double hypo;
		if(l3 > l2 && l3 > l1){
			leg1 = l1;
			leg2 = l2;
			hypo = l3;
		}
		else if(l2 > l3 && l2 > l1){
			leg1 = l1;
			leg2 = l3;
			hypo = l2;
		}
		else if(l1 > l2 && l1 > l2){
			leg1 = l3;
			leg2 = l2;
			hypo = l1;
		}
		else{
			return false;
		}
		if((leg1*leg1)+(leg2*leg2)==(hypo*hypo)){
			return true;
		}
		else{
			return false;
		}
	}
}
