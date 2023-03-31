package ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Ex2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2 frame = new Ex2();
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
	public Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 217, 130);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Senha:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 58, 14);
		contentPane.add(lblNewLabel);
		
		txtNum1 = new JTextField();
		txtNum1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum1.setEnabled(false);
		txtNum1.setEditable(false);
		txtNum1.setBounds(78, 5, 30, 30);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum2.setEnabled(false);
		txtNum2.setEditable(false);
		txtNum2.setColumns(10);
		txtNum2.setBounds(118, 5, 30, 30);
		contentPane.add(txtNum2);
		
		txtNum3 = new JTextField();
		txtNum3.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum3.setEnabled(false);
		txtNum3.setEditable(false);
		txtNum3.setColumns(10);
		txtNum3.setBounds(158, 5, 30, 30);
		contentPane.add(txtNum3);
		
		JButton btnSenha = new JButton("Gerar Senha");
		btnSenha.setBounds(78, 46, 110, 23);
		contentPane.add(btnSenha);
		
		btnSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int max = 9;
				int min = 0;
				int range = max - min + 1;
				int numAleatorio1 = 0;
				int numAleatorio2 = 0;
				int numAleatorio3 = 0;
				for (int i = 0; i < 10; i++) {
					numAleatorio1 = (int)(Math.random() * range) + min;
					numAleatorio2 = (int)(Math.random() * range) + min;
					numAleatorio3 = (int)(Math.random() * range) + min;
				}
				txtNum1.setText(String.valueOf(numAleatorio1));
				txtNum2.setText(String.valueOf(numAleatorio2));
				txtNum3.setText(String.valueOf(numAleatorio3));
			}
		});
	}

}
