import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class submenu extends JFrame {
	
	public submenu() {
		initUI();
	}
	
	private void initUI() {
		createMenuBar();
		
		setTitle("Simple menu");
        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createMenuBar() {
		var menuBar = new JMenuBar();
		var exitIcon = new ImageIcon("resources/Icon.png");
		var openIcon = new ImageIcon("resources/open.png");
		var saveIcon = new ImageIcon("resources/save.png");
		var newIcon = new ImageIcon("resources/new.png");
		
		 var fileMenu = new JMenu("File");
		 var impMenu = new JMenu("Import");
	        fileMenu.setMnemonic(KeyEvent.VK_F);
	        impMenu.setMnemonic(KeyEvent.VK_I);

	        var newMenuItem = new JMenuItem(new MenuItemAction("New", newIcon,
	                KeyEvent.VK_N));

	        var openMenuItem = new JMenuItem(new MenuItemAction("Open", openIcon,
	                KeyEvent.VK_O));

	        var saveMenuItem = new JMenuItem(new MenuItemAction("Save", saveIcon,
	                KeyEvent.VK_S));

	        var newsMenuItem = new JMenuItem("Import newsfeed list...");
	        var bookmarksMenuItem = new JMenuItem("Import bookmarks...");
	        var importMailMenuItem = new JMenuItem("Import mail...");

	        var exitMenuItem = new JMenuItem("Exit", exitIcon);
	        exitMenuItem.setMnemonic(KeyEvent.VK_E);
	        exitMenuItem.setToolTipText("Exit application");
	        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,
	                InputEvent.CTRL_DOWN_MASK));

	        exitMenuItem.addActionListener((event) -> System.exit(0));
	        
	        impMenu.add(newsMenuItem);
	        impMenu.add(bookmarksMenuItem);
	        impMenu.add(importMailMenuItem);
	        
	        fileMenu.add(newMenuItem);
	        fileMenu.add(openMenuItem);
	        fileMenu.add(saveMenuItem);
	        fileMenu.addSeparator();
	        fileMenu.add(impMenu);
	        fileMenu.addSeparator();
	        fileMenu.add(exitMenuItem);

	        menuBar.add(fileMenu);

	        setJMenuBar(menuBar);
	}
	
	 private class MenuItemAction extends AbstractAction {
		public MenuItemAction(String text, ImageIcon icon, Integer mnemonic) {
			super(text);
			putValue(SMALL_ICON, icon);
			putValue(MNEMONIC_KEY,mnemonic);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
		}
	}
	public static void main(String [] args) {
		EventQueue.invokeLater(() ->{
			var ex = new submenu();
			ex.setVisible(true);
		});
	}
}
