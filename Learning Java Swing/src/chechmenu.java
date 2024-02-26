import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.Box;
public class chechmenu extends JFrame {
	 private JLabel statusBar;
	 private JLabel difBar;
	 
	 public chechmenu() {
		 initUI();
	 }
	 
	 private void initUI() {
		 createMenuBar();
		 
		 
		 statusBar = new JLabel("Ready");
		 statusBar.setBorder(BorderFactory.createEtchedBorder());
		 add(statusBar, BorderLayout.SOUTH);
		 
		 difBar = new JLabel("Easy");
		 difBar.setBorder(BorderFactory.createEtchedBorder());
		 add(difBar,BorderLayout.NORTH);
		 
		 setTitle("JCheckBoxMenuItem");
	     setSize(360, 250);
	     setLocationRelativeTo(null);
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	 
	 private void createMenuBar() {
		 var menuBar = new JMenuBar();
	     var fileMenu = new JMenu("File");
	     fileMenu.setMnemonic(KeyEvent.VK_F); 
	     
	     //RadioButton
	     var difMenu = new JMenu("Difficulty");
	        difMenu.setMnemonic(KeyEvent.VK_D);

	        var difGroup = new ButtonGroup();

	        var easyRMenuItem = new JRadioButtonMenuItem("Easy");
	        easyRMenuItem.setSelected(true);
	        difMenu.add(easyRMenuItem);

	        easyRMenuItem.addItemListener((e) -> {
	            if (e.getStateChange() == ItemEvent.SELECTED) {
	                difBar.setText("Easy");
	            }
	        });

	        var mediumRMenuItem = new JRadioButtonMenuItem("Medium");
	        difMenu.add(mediumRMenuItem);

	        mediumRMenuItem.addItemListener((e) -> {
	            if (e.getStateChange() == ItemEvent.SELECTED) {
	            	difBar.setText("Medium");
	            }
	        });

	        var hardRMenuItem = new JRadioButtonMenuItem("Hard");
	        difMenu.add(hardRMenuItem);

	        hardRMenuItem.addItemListener((e) -> {
	            if (e.getStateChange() == ItemEvent.SELECTED) {
	            	difBar.setText("Hard");
	            }
	        });

	        difGroup.add(easyRMenuItem);
	        difGroup.add(mediumRMenuItem);
	        difGroup.add(hardRMenuItem);

	        menuBar.add(difMenu);

	        
	    
	     //checkMenuBar
	     var viewMenu = new JMenu("View");
	     viewMenu.setMnemonic(KeyEvent.VK_V);
	     
	     var showStatusBarMenuItem = new JCheckBoxMenuItem("Show statubar");
	     showStatusBarMenuItem.setMnemonic(KeyEvent.VK_S);
	     showStatusBarMenuItem.setDisplayedMnemonicIndex(5);
	     showStatusBarMenuItem.setSelected(true);
	     
	     showStatusBarMenuItem.addItemListener((e) ->{
	    	 if(e.getStateChange() == ItemEvent.SELECTED) {
	    		 statusBar.setVisible(true);
	    	 }else {
	    		 statusBar.setVisible(false);
	    	 }
	     
	     });
	     viewMenu.add(showStatusBarMenuItem);
	     menuBar.add(Box.createHorizontalGlue());
	     menuBar.add(fileMenu);
	     menuBar.add(viewMenu);
	     
	     setJMenuBar(menuBar);
	 }
	 
	 public static void main(String[] args) {

	        EventQueue.invokeLater(() -> {

	            var ex = new chechmenu();
	            ex.setVisible(true);
	        });
	    }

}
