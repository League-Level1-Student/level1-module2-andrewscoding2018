
public class JamesBond {
	static Vault v = new Vault();
	boolean b;

	public static void main(String[] args) {
		findCode(v);
	}

	public static void findCode(Vault v) {
		for (int i = 0; i < 1000001; i++) {
			boolean b = v.tryCode(i);
			System.out.println("The code is not " + i + " .");
			if (b == true) {
				System.out.println("The code is " + i + " .");
				break;
			}
		}
	}
}
