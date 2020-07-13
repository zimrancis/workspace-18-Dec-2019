package static0;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class LocalizeExample extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5619108400901639683L;
	JButton go;
	AbstractButton button;
	ButtonGroup group;
	Locale locale;
	String msg;
	ResourceBundle rb;

	public LocalizeExample() {
		locale = Locale.US; // default value
		rb = ResourceBundle.getBundle("example.messages", locale);
		msg = rb.getString("SaveMsg");
		UIManager.put("OptionPane.titleText", rb.getString("TitleText"));
		group = new ButtonGroup();
		button = new JRadioButton("English", true);
		button.setActionCommand("en");
		button.addActionListener(this);
		group.add(button);
		add(button);
		button = new JRadioButton("Bangla");
		button.setActionCommand("bn");
		button.addActionListener(this);
		group.add(button);
		add(button);
		go = new JButton("Change it");
		go.addActionListener(this);
		add(go);
	}

	public void setUILanguage() {
		rb = ResourceBundle.getBundle("example.messages", locale);
		UIManager.put("Button.font", new Font("SolaimanLipi", Font.PLAIN, 14));
		UIManager.put("Label.font", new Font("SolaimanLipi", Font.PLAIN, 14));
		UIManager.put("OptionPane.font", new Font("SolaimanLipi", Font.PLAIN, 14));
		UIManager.put("OptionPane.titleText", new Font("SolaimanLipi", Font.PLAIN, 14));
		UIManager.put("OptionPane.titleText", rb.getString("TitleText"));
		UIManager.put("OptionPane.yesButtonText", rb.getString("Yes"));
		UIManager.put("OptionPane.noButtonText", rb.getString("No"));
		UIManager.put("OptionPane.cancelButtonText", rb.getString("Cancel"));
		msg = rb.getString("SaveMsg");
	}

	public void actionPerformed(ActionEvent e) {
		int result;
		if (e.getSource() instanceof JRadioButton) {
			if (e.getActionCommand().equals("en")) {
				locale = Locale.US;
			} else {
				Locale BANGLA = new Locale("bn");
				locale = BANGLA;
			}
			setUILanguage();
		} else {
// the button action
			result = JOptionPane.showConfirmDialog(this, msg);
			System.out.println(result);
		}
	}

	public Dimension getPreferredSize() {
		return new Dimension(200, 200);
	}

	public static void main(String s[]) {
		JFrame frame = new JFrame("");
		LocalizeExample panel = new LocalizeExample();
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(panel, "Center");
		frame.setSize(panel.getPreferredSize());
		frame.setVisible(true);
	}
}