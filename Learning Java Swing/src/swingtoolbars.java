import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;

public class swingtoolbars extends JFrame {
		
	public swingtoolbars(){
		initUI();
	}
	
	private void initUI() {
		createToolbars();
		
		setTitle("Toolbars");
        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createToolbars() {
		
		var toolbar1 = new JToolBar();
		var toolbar2 = new JToolBar();
		
		var exitIcon = new ImageIcon("resources/Icon.png");
		var openIcon = new ImageIcon("resources/open.png");
		var saveIcon = new ImageIcon("resources/save.png");
		var newIcon = new ImageIcon("resources/new.png");
		
		var newBtn = new JButton(newIcon);
		var openBtn = new JButton(openIcon);
		var saveBtn = new JButton(saveIcon);
		
		toolbar1.add(newBtn);
		toolbar1.add(openBtn);
		toolbar1.add(saveBtn);
		
		var exitBtn = new JButton(exitIcon);
		exitBtn.setMnemonic(KeyEvent.VK_F);
		toolbar2.add(exitBtn);
		
		exitBtn.addActionListener((e) -> System.exit(0));
		
		createLayout(toolbar1,toolbar2);
	}
	
	private void createLayout(JComponent...arg) {
		
		var pane = getContentPane();
		var gl = new GroupLayout(pane);
		pane.setLayout(gl);
		
		gl.setHorizontalGroup(gl.createParallelGroup()
				.addComponent(arg[0], GroupLayout.DEFAULT_SIZE,
				GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
				.addComponent(arg[1],GroupLayout.DEFAULT_SIZE,
						GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE));
		
		gl.setVerticalGroup(gl.createSequentialGroup()
				.addComponent(arg[0])
				.addComponent(arg[1]));
	}
	
	public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new swingtoolbars();
            ex.setVisible(true);
        });
    }
}
