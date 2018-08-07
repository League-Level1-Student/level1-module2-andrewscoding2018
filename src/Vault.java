import java.util.Random;

public class Vault {
	Random r  = new Random();
	int secret = r.nextInt(1000001);

	public boolean tryCode(int i) {
		if (secret == i) {
			return true;
		} else {
			return false;
		}
	}
}
