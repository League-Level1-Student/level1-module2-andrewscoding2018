import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
		Popcorn p = new Popcorn(flavor);
		Microwave m = new Microwave();
		m.putInMicrowave(p);
		m.setTime(10);
		m.startMicrowave();
	}
}
