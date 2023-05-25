package Demo;

class A {
	int a(int a) {
		return a;
	}

	int a(int b, int c) {
		return b + c;

	}
}

class D extends A {
	@Override
	int a(int a) {
		// TODO Auto-generated method stub
		return super.a(a);
	}

	@Override
	int a(int b, int c) {
		// TODO Auto-generated method stub
		return super.a(b, c);
	}
}

public class J {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a(20));
		A b = new A();
		System.out.println(b.a(20, 30));
		D d = new D();
		System.out.println(d.a(5, 5));
	}
}
