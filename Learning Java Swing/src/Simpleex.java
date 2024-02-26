import java.awt.EventQueue;
import javax.swing.JFrame;
public class Simpleex extends JFrame {
	
	public Simpleex(){
		initUI();
	}
	
	private void initUI() {
		setTitle("Ex1");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[]args) {
		EventQueue.invokeLater(()->{
			var ex = new Simpleex();
			ex.setVisible(true);
		});
	}
}
