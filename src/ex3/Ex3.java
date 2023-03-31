package ex3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtModelo;
	private JTextField txtFabri;
	private JTextField txtAno;
	private JTextField txtVeiculos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3 frame = new Ex3();
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
	public Ex3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 20, 53, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Modelo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 60, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ano:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 100, 39, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fabricante:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(10, 140, 85, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Veículo cadastrado:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(10, 180, 156, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(105, 19, 281, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(105, 59, 281, 20);
		contentPane.add(txtModelo);
		
		txtFabri = new JTextField();
		txtFabri.setColumns(10);
		txtFabri.setBounds(105, 139, 281, 20);
		contentPane.add(txtFabri);
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		txtAno.setBounds(105, 99, 141, 20);
		contentPane.add(txtAno);
		
		txtVeiculos = new JTextField();
		txtVeiculos.setEditable(false);
		txtVeiculos.setEnabled(false);
		txtVeiculos.setColumns(10);
		txtVeiculos.setBounds(10, 205, 376, 20);
		contentPane.add(txtVeiculos);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 245, 156, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(230, 245, 156, 23);
		contentPane.add(btnLimpar);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String marca = txtModelo.getText();
				String ano = txtAno.getText();
				String fabricante = txtFabri.getText();
				txtVeiculos.setText("Nome: " + nome + "\nMarca: " + marca + "\nAno" + ano + "\nFabricante: " + fabricante);
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				txtModelo.setText("");
				txtAno.setText("");
				txtFabri.setText("");
				txtVeiculos.setText("");
			}
		});
	}

}
