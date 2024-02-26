import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;

public class boardlayout extends JFrame {
	
	public boardlayout() {
		initUI();
	}
	
	private void initUI() {
		var bottompanel = new JPanel(new BorderLayout());		
		var toppanel = new JPanel();
		
		toppanel.setBackground(Color.gray);
		toppanel.setPreferredSize(new Dimension(250,150));
		bottompanel.add(toppanel);
		
		bottompanel.setBorder(new EmptyBorder(new Insets(20,20,20,20)));
		
		add(bottompanel);
		
		pack();
		
		  setTitle("BorderLayout");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	    }

	    public static void main(String[] args) {

	        EventQueue.invokeLater(() -> {
	            var ex = new boardlayout();
	            ex.setVisible(true);
	        });
	    }

}
