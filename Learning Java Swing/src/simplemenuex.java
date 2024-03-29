import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class simplemenuex extends JFrame {
	
	public simplemenuex() {
		initUI();
	}
	
	private void initUI() {
		createMenuBar();
		
		setTitle("Simple menu");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createMenuBar() {
		var menuBar = new JMenuBar();
		var exitIcon = new ImageIcon("resources/Icon.png");
		
		var fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		var eMenuItem = new JMenuItem("Exit", exitIcon);
		eMenuItem.setMnemonic(KeyEvent.VK_E);
		eMenuItem.setToolTipText("Exit application");
		eMenuItem.addActionListener((event) -> System.exit(0));
		
		fileMenu.add(eMenuItem);
		menuBar.add(fileMenu);
		
		setJMenuBar(menuBar);
	}
	public static void main(String [] args) {
		EventQueue.invokeLater(() ->{
			var ex = new simplemenuex();
			ex.setVisible(true);
		});
	}
}
