// A simple example of inharitance
	// creat a super class
class A{
	int i, j;

	void showij(){
	System.out.println("i and j: " + i + " " + j);
}
}
	// Creat a subclass by extending class A.
	class B extends A {
	int k;

	void showk(){
	System.out.println("k: " + k);
}
	void sum(){
	System.out.println("i+j+k: " + (i+j+k));
}
}

	class SimpleInheritance{
	public static void main(String args []){
	A superOb = new A();

	B superOb = new B();
	//The super class may be used by itself.
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Contents of subOb: ");
		superOb.showij();
		System.out.println();

	//The subclass access to all public members of itssuperclass.
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Contents of subOb: ");
		subOb.ij();
		subOb.showk();
		System.out.println();
		System.out.println("Sum of i, j and k in subOb:");
		subOb.sum();
}
}