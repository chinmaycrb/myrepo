package Demo;

class A {
	static void m1() {
		System.out.println("I am nikhils");
	}
}

class StaticMember extends A {

	public static void m1() {
		System.out.println("Dipesh");
		System.out.println();
	}
}

class Static {
	public static void main(String[] args) {
		A s1=new StaticMember();
s1.m1();
	}
}
