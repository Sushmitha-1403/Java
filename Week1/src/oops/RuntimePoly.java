package oops;

 class Poly {
	void display() {
		System.out.println("This is Super Class");
	}
}
class RuntimePoly extends Poly{
	void display() {
		System.out.println("This is Sub Class");
	}

	public static void main(String args[]) {
		Poly rp = new RuntimePoly();
		rp.display();
}

}
