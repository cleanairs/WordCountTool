package CountingWords;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class wordCount extends JFrame {

	private JPanel contentPane;
	private JTextField TotalCountTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wordCount frame = new wordCount();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public wordCount() {
		setBackground(new Color(255, 255, 224));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel wrdCountPanel = new JPanel();
		wrdCountPanel.setBackground(new Color(255, 255, 224));
		contentPane.add(wrdCountPanel, BorderLayout.CENTER);
		wrdCountPanel.setLayout(null);
		
		JLabel wrdLabel = new JLabel("Type words");
		wrdLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		wrdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		wrdLabel.setBounds(10, 53, 113, 42);
		wrdCountPanel.add(wrdLabel);
		
		JTextArea wrdTextArea = new JTextArea();
		wrdTextArea.setBounds(133, 48, 452, 139);
		wrdCountPanel.add(wrdTextArea);
		
		JButton wrdCountBtn = new JButton("Count your words");
		wrdCountBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentence = wrdTextArea.getText();
				int words = 1;
				for (int j = 0; j < sentence.length(); j++) {
					if (sentence.charAt(j)==' ') {
						words++;
					}
				}
				TotalCountTextField.setText(" " + words);
				
			}
		});
		wrdCountBtn.setForeground(new Color(255, 255, 255));
		wrdCountBtn.setBackground(new Color(186, 85, 211));
		wrdCountBtn.setFont(new Font("Tahoma", Font.BOLD, 21));
		wrdCountBtn.setBounds(133, 198, 452, 40);
		wrdCountPanel.add(wrdCountBtn);
		
		TotalCountTextField = new JTextField();
		TotalCountTextField.setBounds(325, 250, 146, 50);
		wrdCountPanel.add(TotalCountTextField);
		TotalCountTextField.setColumns(10);
		
		JLabel TotalWrdLabel = new JLabel("Total words:");
		TotalWrdLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		TotalWrdLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		TotalWrdLabel.setBounds(221, 267, 94, 14);
		wrdCountPanel.add(TotalWrdLabel);
		
		JButton ClearBtn = new JButton("Clear");
		ClearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wrdTextArea.setText("");
				TotalCountTextField.setText("");
			}
		});
		ClearBtn.setForeground(new Color(255, 255, 255));
		ClearBtn.setBackground(new Color(30, 144, 255));
		ClearBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		ClearBtn.setBounds(133, 325, 89, 36);
		wrdCountPanel.add(ClearBtn);
		
		JButton Exitbtn = new JButton("Exit");
		Exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); //Geht nur wenn das Programm nicht rechnet
			}
		});
		Exitbtn.setForeground(new Color(255, 255, 255));
		Exitbtn.setBackground(new Color(255, 0, 0));
		Exitbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		Exitbtn.setBounds(496, 325, 89, 36);
		wrdCountPanel.add(Exitbtn);
		
		JLabel TiteleLabel = new JLabel("Word Count Tool");
		TiteleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TiteleLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		TiteleLabel.setBounds(10, 16, 575, 26);
		wrdCountPanel.add(TiteleLabel);
	}
}
