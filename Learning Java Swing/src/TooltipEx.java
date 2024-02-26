import java.awt.EventQueue;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;

public class TooltipEx extends JFrame {
	 public TooltipEx() {
		 initUI();
	 }
	 
	 private void initUI() {
		 var btn = new JButton("Button");
		 btn.setToolTipText("A button component");
		 btn.addActionListener((event) -> System.exit(0));
		 btn.setMnemonic(KeyEvent.VK_B);
		 
		 createLayout(btn);
		 
		 setTitle("Algo ai");
		 setSize(300,200);
		 setLocationRelativeTo(null);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 }
	 
	 private void createLayout(JComponent...arg) {
		 var pane = (JPanel) getContentPane();
		 var gl = new GroupLayout(pane);
		 pane.setLayout(gl);
		 
		 pane.setToolTipText("Content pane");
		 
		 gl.setAutoCreateContainerGaps(true);
		 
		 gl.setHorizontalGroup(gl.createSequentialGroup()
				 .addComponent(arg[0])
				 .addGap(200));
		 
		 gl.setVerticalGroup(gl.createSequentialGroup()
				 .addComponent(arg[0])
				 .addGap(200));
		 pack();
	 }
	 
	 public static void main(String [] args) {
			EventQueue.invokeLater(() ->{
				var ex = new TooltipEx();
				ex.setVisible(true);
			});
		}
}
