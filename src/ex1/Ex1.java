package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;

public class Ex1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdade;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1 frame = new Ex1();
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
	public Ex1() {
		setTitle("Cálculo de ano de nascimento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Idade:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 46, 20);
		contentPane.add(lblNewLabel);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(66, 13, 52, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblAnoDeNascimento = new JLabel("Ano de nascimento:");
		lblAnoDeNascimento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAnoDeNascimento.setBounds(10, 60, 144, 20);
		contentPane.add(lblAnoDeNascimento);
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		txtAno.setBounds(164, 62, 75, 20);
		contentPane.add(txtAno);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(10, 91, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(150, 91, 89, 23);
		contentPane.add(btnLimpar);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idadeTxt = txtIdade.getText();
				Integer idade = Integer.valueOf(idadeTxt);
				Calendar cal = GregorianCalendar.getInstance();
				int anoAtual = cal.get(Calendar.YEAR);
				Integer anoNascimento = Integer.valueOf(anoAtual - idade);
				txtAno.setText(String.valueOf(anoNascimento));
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIdade.setText("");
				txtAno.setText("");
			}
		});
	}
}
