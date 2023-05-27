package jay;

class Jr{
	public Jr() {	
	}
	
	int A;
		String B;
		public Jr(int a, String b) {
			super();
			A = a;
			B = b;
		}
		
		@Override
		public String toString() {
			return "Jr [A=" + A + ", B=" + B + "]";
		}
}	




public class J {
	public static void main(String[] args) {
		Jr b = new Jr(12,"jaydeep");
		System.out.println(b);
	}
	

}
