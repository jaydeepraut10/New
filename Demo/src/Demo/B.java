package Demo;

class T{
	int b(int b) {
		return b;
	}

	int c(int d, int e) {
		return d + e;
	}

}

public class B {
	public static void main(String[] args) {
T t=new T();
System.out.println(t.b(5));
System.out.println(t.c(5, 5));

		
	}
}
