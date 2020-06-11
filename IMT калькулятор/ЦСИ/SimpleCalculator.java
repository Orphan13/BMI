

import javax.swing.*;
import java.awt.GridLayout;
public class SimpleCalculator {

	public static void main(String[] args) {
		
// Create panel
		
		JPanel windowContent = new JPanel();
		
		// Set manager for this panel
		
		GridLayout gl = new GridLayout (7,2);
		windowContent.setLayout(gl);
		
		// Create components
		
		JLabel label1 = new JLabel("Èìÿ:");
		JTextField field1 = new JTextField(7);
		
		JLabel label2 = new JLabel("Âåñ:");
		JTextField field2 = new JTextField(7);
		
		JLabel label3 = new JLabel("Ðîñò:");
		JTextField field3 = new JTextField(7);
		
		JLabel label4 = new JLabel("Âîçðàñò:");
		JTextField field4 = new JTextField(7);
		
		
		JLabel label5 = new JLabel("Çíà÷åíèå IMT:");
		JTextField result = new JTextField(7);
		
		JTextField result1 = new JTextField(7);
		JButton go = new JButton("Ðàññ÷èòàòü");
		
		// Add components
		
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(field3);
		windowContent.add(label4);
		windowContent.add(field4);
		windowContent.add(label5);
		windowContent.add(result);
		windowContent.add(go);
		windowContent.add(result1);
		
		
		// Create frame and set panel
		
		JFrame frame = new JFrame("Êàëüêóëÿòîð ÈÌÒ");
		frame.setContentPane(windowContent);
		
		// Set size and do it frame visible
		
		frame.setSize(400,200);
		frame.setVisible(true);
		

	}

}
