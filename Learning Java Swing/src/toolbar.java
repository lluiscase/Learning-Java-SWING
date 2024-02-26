import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import javax.swing.GroupLayout;
import javax.swing.JComponent;

public class toolbar extends JFrame {
	
	public toolbar(){
		initUI();
	}
	
	private void initUI() {
		createMenuBar();
        createToolBar();

        setTitle("Simple toolbar");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	 private void createMenuBar() {

	        var menuBar = new JMenuBar();
	        var fileMenu = new JMenu("File");

	        menuBar.add(fileMenu);
	        setJMenuBar(menuBar);
	    }
	 
	 private void createToolBar() {
		 var toolbar = new JToolBar();
		 var icon = new ImageIcon("resources/Icon.png");
		 
		 var exitButton = new JButton(icon);
		 exitButton.setMnemonic(KeyEvent.VK_F);
		 toolbar.add(exitButton);
		 
		 exitButton.addActionListener((e) -> System.exit(0));
		 
		 add(toolbar, BorderLayout.NORTH);
	 }
	 
	 public static void main(String[] args) {

	        EventQueue.invokeLater(() -> {

	            var ex = new toolbar();
	            ex.setVisible(true);
	        });
	    }

}
