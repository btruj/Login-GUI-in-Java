import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	private static JLabel unsuccess;

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		//configure panel
				panel.setLayout(null);

		//make label
		 userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);

		// make textfield
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
				
		//make password label
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		// make password textfield
				 passwordText = new JPasswordField(20);
				passwordText.setBounds(100, 50, 165, 25);
				panel.add(passwordText);
				
		//make login button
			    button = new JButton("Login");
				button.setBounds(10, 80, 80, 25);
				button.addActionListener(new GUI());
				panel.add(button);
				
			// make "success" label
			    success = new JLabel("");
				success.setBounds(10, 110, 300, 25);
				panel.add(success);
				
				// make "unsuccess" label
			    unsuccess = new JLabel("");
				unsuccess.setBounds(10, 110, 300, 25);
				panel.add(unsuccess);
				
				frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	String user = userText.getText();
	String password = passwordText.getText();
	
	
	if(user.equals("Bryan") && password.equals("abc123")) {
		success.setText("Login successful!");
	} else {
		unsuccess.setText("Login Failed!");
	}
		
	}

}
