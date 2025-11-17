package Pekan8_2511532003;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class OperatorArtimatikaGUI_2511532003 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private int hasil;
	private JTextField txtHasil;
	
	private void pesanPeringatan (String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror (String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Eror", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorArtimatikaGUI_2511532003 frame = new OperatorArtimatikaGUI_2511532003();
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
	public OperatorArtimatikaGUI_2511532003() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setFont(new Font("SimSun-ExtB", Font.BOLD, 12));
		lblNewLabel.setBounds(151, 10, 134, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BILANGAN 1");
		lblNewLabel_1.setBounds(10, 35, 69, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("BILANGAN 2");
		lblNewLabel_1_1.setBounds(10, 63, 69, 12);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("OPERATOR");
		lblNewLabel_1_2.setBounds(10, 104, 69, 12);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("HASIL");
		lblNewLabel_1_3.setBounds(10, 127, 69, 12);
		contentPane.add(lblNewLabel_1_3);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(83, 35, 96, 18);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setColumns(10);
		txtBil2.setBounds(83, 61, 96, 18);
		contentPane.add(txtBil2);
		
//		hasil = new JTextField();
//		hasil.setColumns(10);
//		hasil.setBounds(82, 125, 96, 18);
//		contentPane.add(hasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(83, 99, 28, 20);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("PROSES");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan("bilangan 1 harus diisi");
				} else if (txtBil2.getText().trim().isEmpty()){
					pesanPeringatan("bilangan 2 harus diisi");
		}else 
		{ try {
				int a = Integer.parseInt(txtBil1.getText());
				int b =Integer.parseInt(txtBil2.getText());
				int c = cbOperator.getSelectedIndex();
				if (c==0) {hasil = a+b;}
				if (c==1) {hasil = a-b;}
				if (c==2) {hasil = a*b;}
				if (c==3) {hasil = a/b;}
				if (c==4) {hasil = a%b;}
		}catch (NumberFormatException ex) {
					pesanEror("Bilangan 1 dan Bilangan 2 harus angka");
				}
		}
				txtHasil.setText(String.valueOf(hasil));
				
			}
		});
		btnNewButton.setBounds(159, 99, 84, 20);
		contentPane.add(btnNewButton);
		
		txtHasil = new JTextField();
		txtHasil.setBounds(83, 124, 96, 18);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);

	}
}
